package ch.hearc.ig.odi.customeraccount.business;

public class Account {

    private Customer customer;
    private String number;
    private String name;
    private double balance = 0;
    private double rate = 0.001;

    public Account(String number, String name, double rate, Customer customer){
        this.number = number;
        this.name = name;
        this.rate = rate;
        this.customer = customer;
    }
    
    public Account(Customer customer, String number, String name) {
        this.customer = customer;
        this.number = number;
        this.name = name;
    }    

    /**
     *
     * @param amount
     */
    public void credit(double amount) {
        balance += amount;
    }

    /**
     *
     * @param amount
     */
    public void debit(double amount) {
        if ((balance - amount) > 0) {
            balance -= amount;
        }
    }

    /**
     *
     * @param amount
     * @param source
     * @param target
     */
    public static void transfer(double amount, Account source, Account target) {
        // TODO test si possible
        source.credit(amount);
        target.debit(amount);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    

}
