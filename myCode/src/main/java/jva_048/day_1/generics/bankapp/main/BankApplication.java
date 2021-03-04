package jva_048.day_1.generics.bankapp.main;

import jva_048.day_1.generics.bankapp.domain.*;
import jva_048.day_1.generics.bankapp.service.BankService;

public class BankApplication {
	
	private static Bank bank;
	
	public static void main(String[] args) {
		bank = new Bank();
		modifyBank();
		printBalance();
		BankService.printMaximumAmountToWithdraw(bank);
	}
	
	private static void modifyBank() {
		Client client1 = new Client("John", Gender.MALE);
		Account account1 = new SavingAccount(1, 100);
		Account account2 = new CheckingAccount(2, 100, 20);
		client1.addAccount(account1);
		client1.addAccount(account2);

		try {
			BankService.addClient( bank, client1 );
		} catch (Exception e) {
			System.out.format( "Cannot add an already existing client: %s%n", client1.getName() );
		}

		account1.deposit(100);
		try {
			account1.withdraw( 10 );
		} catch (Exception e) {

		}
		try {
			account2.withdraw( 90 );
		} catch (Exception e) {

		}

		try {
			account2.withdraw( 100 );
		} catch (Exception e) {

		}

		try {
			BankService.addClient( bank, client1 );
		} catch (Exception e) {
		}
	}
	
	private static void printBalance() {
		System.out.format("%nPrint balance for all clients%n");
		for(Client client : bank.getClients()) {
			System.out.println("Client: " + client);
			for (Account account : client.getAccounts()) {
				System.out.format("Account %d : %.2f%n", account.getId(), account.getBalance());
			}
		}
	}

}
