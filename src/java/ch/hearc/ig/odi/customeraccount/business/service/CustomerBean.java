/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business.service;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.business.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author maximili.jeannere
 */
@Named
@SessionScoped

// Lié à une page (un formulaire par exemple). Couche de services permettant de ne pas avoir une classe services trop grandes
public class CustomerBean implements Serializable{

    // Injection de la classe Services
    @Inject Services services;
    
    public CustomerBean() {
    }
    
    public List<Customer> getCustomers(){
        return services.getCustomersList();
    }
}
