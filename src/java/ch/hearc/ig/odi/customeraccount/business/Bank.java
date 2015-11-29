package ch.hearc.ig.odi.customeraccount.business;

import java.util.HashSet;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.business.Account;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	private int number;
	private String name;
	private Map<Integer, Customer> customers;
	private Map<String, Account> accounts;

	public Bank(int number, String name) {
            this.number = number;
            this.name = name;
            
            customers = new HashMap<Integer, Customer>();
            accounts = new HashMap<String, Account>();
	}

	public Account getAccountByNumber(String number) {
            Account account = null;
            
            if(accounts.containsKey(number)){
                account = accounts.get(number);
            }
                    
            return account;
	}

	public Customer getCustomerByNumber(int number) {
            Customer customer = null;
            
            if(customers.containsKey(number)){
                customer = customers.get(number);
            }
            
            return customer;
	}

        public void addCustomer(int number, String firstName, String lastName) {
            Customer customer = new Customer(number, firstName, lastName);
            customers.put(customer.getNumber(), customer);
	}
        
        public void addCustomer(Customer customer) {
            customers.put(customer.getNumber(), customer);
	}
        
	public void addAccount(String number, String name, double rate, Customer customer) {
            customer.addAccount(number, name, rate);
            
            accounts.put(number, customer.getAccountByNumber(number));
	}
        
        public Map<Integer, Customer> getCustomers(){
            return customers;
        }
        
        public void CreateCustomers(){
            Customer cust = new Customer(1, "Jean", "Dupont");
            addCustomer(cust);
            addAccount("1", "Salaire", 0.001, cust);
            addAccount("2", "Impots", 0.002, cust);
            
            Customer cust2 = new Customer(2, "Marie", "Froideveau");
            addCustomer(cust2);
            addAccount("3", "Epargne", 0.002, cust2);
            addAccount("4", "Salaire", 0.001, cust2);
            
            Customer cust3 = new Customer(3, "Alex", "Dupertuis");
            addCustomer(cust3);
        }
}