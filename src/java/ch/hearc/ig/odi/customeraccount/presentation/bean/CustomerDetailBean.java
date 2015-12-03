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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author maximili.jeannere
 */
@Named(value="customerDetailBean")
@SessionScoped
public class CustomerDetailBean implements Serializable{

    @Inject Services services;

    private Customer customer;
    
    public CustomerDetailBean(){
        customer = new Customer();
    }
    
    /**
     * Set le compte du bean detail compte
     * @param account
     * @return 
     */
    public String detailAccount(Account account){
        AccountDetailBean accountDetailBean = Tools.findBean("accountDetailBean", AccountDetailBean.class);
        accountDetailBean.setAccount(account);       
        return "success";
    }
    
    public String addAccount(int customerNumber){
        // Recherche le bean pouvant ajouter le compte
        /*AccountDetailBean accountDetailBean = Tools.findBean("accountDetailBean", AccountDetailBean.class);
        
        for(Account account: accounts){
            if(account.getNumber().equals(number)){
                accountDetailBean.setNumber(account.getNumber());
                accountDetailBean.setNumCustomer(customerNumber);
                accountDetailBean.setName(account.getName());
                accountDetailBean.setBalance(account.getBalance());
                accountDetailBean.setRate(account.getRate());
            }
        }*/
       
        return "success";
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public List<Account> getAccounts(){
        return new ArrayList(customer.getAccounts().values());
    }
    
}
