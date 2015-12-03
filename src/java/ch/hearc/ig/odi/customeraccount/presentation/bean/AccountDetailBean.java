/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.presentation.bean;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.business.service.Services;
import ch.hearc.ig.odi.customeraccount.business.service.Tools;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author maximili.jeannere
 */
@Named(value="accountDetailBean")
@SessionScoped // Session obligatoire comme pour detailCustomer
public class AccountDetailBean implements Serializable{

    @Inject Services services;

    private Account account;
    
    public AccountDetailBean(){
        
    }
    
    /**
     * Méthode qui reçoit le compte à afficher sur la page.
     * @param account Le compte à afficher
     * @return "success" si le paramètre est correct, "error" s'il est null.
     */
    public String showAccount(Account account){
        if(account != null){
            this.account = account;
            return "success";
        }else{
            this.account = null;
            return "error";
        }
            
    }

    public String returnToCustomer(){
        CustomerBean customerBean = Tools.findBean("customerBean", CustomerBean.class);
        customerBean.displayCustomer(account.getCustomer());
        return "success";
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
