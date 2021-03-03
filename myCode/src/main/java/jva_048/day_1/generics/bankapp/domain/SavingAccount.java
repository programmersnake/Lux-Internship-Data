package jva_048.day_1.generics.bankapp.domain;


public class SavingAccount extends AbstractAccount {
    public SavingAccount(int id, double balance) {
        super( id, balance );
    }

    @Override
    public double maxim() {
        return balance;
    }

    public float maximumAmountToWithdraw() {
        return (float) getBalance();
    }

}
