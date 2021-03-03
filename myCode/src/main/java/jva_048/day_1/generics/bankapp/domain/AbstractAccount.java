package jva_048.day_1.generics.bankapp.domain;

import jva_048.day_1.generics.bankapp.exceptions.NotEnoughFundsException;

public abstract class AbstractAccount implements Account
{

    private int id;
    protected double balance;

    public AbstractAccount(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public void deposit(final double amount)
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException("Cannot deposit a negative amount");
        }
        balance += amount;
    }

    @Override
    public void withdraw(final double amount) throws NotEnoughFundsException
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        }

        if (amount > maximumAmountToWithdraw())
        {
            throw new NotEnoughFundsException(id, balance, amount, "Requested amount exceeds the maximum amount to withdraw");
        }

        balance -= amount;
    }

    @Override
    public int getId()
    {
        return id;
    }

    @Override
    public double getBalance()
    {
        return balance;
    }

}
