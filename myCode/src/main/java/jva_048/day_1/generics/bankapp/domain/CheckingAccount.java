package jva_048.day_1.generics.bankapp.domain;


import jva_048.day_1.generics.bankapp.exceptions.NotEnoughFundsException;
import jva_048.day_1.generics.bankapp.exceptions.OverdraftLimitExceededException;

public class CheckingAccount extends AbstractAccount {

    private double overdraft;

    public CheckingAccount(int id, double balance, double overdraft) {
        super( id, balance );
        if ( overdraft < 0 ) {
            throw new IllegalArgumentException( "Cannot create an account with a starting negative overdraft" );
        }
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double value) throws OverdraftLimitExceededException {
        try {
            super.withdraw( value );
        } catch (NotEnoughFundsException notEnoughFundsException) {
            throw new OverdraftLimitExceededException( notEnoughFundsException, overdraft );
        }
    }

    @Override
    public double maxim() {
        return overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public float maximumAmountToWithdraw() {
        return (float) overdraft;
    }
}