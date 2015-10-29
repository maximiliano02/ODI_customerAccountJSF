package ch.hearc.ig.odi.customeraccount.business;

import java.util.HashSet;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.business.Account;

public class Bank {
	private int number;
	private String name;
	private HashSet<Customer> customers = new HashSet<Customer>();
	private HashSet<Account> accounts = new HashSet<Account>();

	public Bank(int number, String name) {
		throw new UnsupportedOperationException();
	}

	public Account getAccountByNumber(String number) {
		throw new UnsupportedOperationException();
	}

	public Customer getCustomerByNumber(int number) {
		throw new UnsupportedOperationException();
	}

	public void addAccount(int number, String firstName, String lastName) {
		throw new UnsupportedOperationException();
	}

	public void addCustomer(String number, String name, double rate, Customer customer) {
		throw new UnsupportedOperationException();
	}
}