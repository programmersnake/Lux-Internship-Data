package jva_048.day_1.generics.bankapp.service;

import jva_048.day_1.generics.bankapp.domain.Account;
import jva_048.day_1.generics.bankapp.domain.Bank;
import jva_048.day_1.generics.bankapp.domain.Client;
import jva_048.day_1.generics.bankapp.exceptions.ClientExistsException;

public class BankService {

    public static void addClient(Bank bank, Client client) throws ClientExistsException {
        bank.addClient( client );
    }

    public static void printMaximumAmountToWithdraw(Bank bank) {
        System.out.format( "%nPrint maximum amount to withdraw for all clients%n" );

        StringBuilder result = new StringBuilder();
        for (Client client : bank.getClients()) {
            result.append( "Client: " )
                    .append( client )
                    .append( "\n" );
            int i = 1;
            for (Account account : client.getAccounts()) {
                result.append( "Account nr. " )
                        .append( i++ )
                        .append( ", maximum amount to withdraw: " )
                        .append( Math.round( account.maximumAmountToWithdraw() * 100 ) / 100d )
                        .append( "\n" );
            }
        }
    }
}