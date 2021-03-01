package jva_046.day_5.bank;

public class Account {

    private final int id;

    private double balance;

    public Account() {
        id = (int) (Math.random() * 1000000);
        balance = 0.0;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if ( amount > 0.0 )
            balance += amount;
    }

    void withdraw(double amount) {
        if ( (amount > 0.0) && (balance >= amount) )
            balance -= amount;
    }

}
