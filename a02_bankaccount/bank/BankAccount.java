package be.kdg.java1.assignments.a02_bankaccount.bank;

public class BankAccount {
    private String holder;
    private String iban;
    private double balance;
    
    public BankAccount(String holder, String iban) {
        this(holder, iban, 0);
    }
    
    public BankAccount(String holder, String iban, double balance) {
        setHolder(holder);
        setIban(iban);
        setBalance(balance);
    }
    
    public String getHolder() {
        return holder;
    }
    
    private void setHolder(String holder) {
        this.holder = holder;
    }
    
    public String getIban() {
        return iban;
    }
    
    private void setIban(String iban) {
        this.iban = iban;
    }
    
    public double getBalance() {
        return balance;
    }
    
    private void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("The account %s of %s has a balance of € %.2f", iban, holder, balance);
    }
}  // class
