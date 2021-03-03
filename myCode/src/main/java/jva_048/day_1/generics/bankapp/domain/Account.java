package jva_048.day_1.generics.bankapp.domain;

import jva_048.day_1.generics.bankapp.exceptions.NotEnoughFundsException;

public interface Account {
    public void deposit(double amount);

    public void withdraw(double amount) throws NotEnoughFundsException;

    public int getId();

    public double getBalance();

    public double maxim();

    float maximumAmountToWithdraw();
}