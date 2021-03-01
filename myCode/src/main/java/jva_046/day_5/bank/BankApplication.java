package jva_046.day_5.bank;

public class BankApplication {

    private static Bank bank = new Bank();

    public static void main(String[] args) {
        Client client1 = new Client( "Alex", Client.Gender.MALE );
        Account accountForClient1 = new Account();
        accountForClient1.deposit( 3000000 );
        client1.addAccount( accountForClient1 );
        Client client2 = new Client( "Sasha", Client.Gender.MALE );
        Account accountForClient2 = new Account();
        accountForClient2.deposit( 500000 );
        client2.addAccount( accountForClient2 );
        Client client3 = new Client( "Lyisa", Client.Gender.FEMALE );
        Account accountForClient3 = new Account();
        accountForClient3.deposit( 20000 );
        client3.addAccount( accountForClient3 );

        bank.addClient( client1 );
        bank.addClient( client2 );
        bank.addClient( client3 );

        modifyBank();
        printBalance();
    }

    public static void modifyBank() {
        for (Client client : bank.getClients()) {
            for (Account account : client.getAccounts()) {
                account.deposit( 5000 );
            }
        }
    }

    public static void printBalance() {
        for (Client client : bank.getClients()) {
            client.getClientGreeting();
            System.out.println( "Client [" + client.getName() + "] has:" );
            for (Account account : client.getAccounts()) {
                System.out.println( "     Balance: " + account.getBalance() );
            }
        }
    }

}
