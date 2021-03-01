package jva_047.day_1.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Client> clients = new ArrayList<>();

    public Bank() {
    }

    public void addClient(Client newClient) {
        new PrintClientListener().onClientAdded( newClient, clients );
    }

    public List<Client> getClients() {
        return clients;
    }

    interface ClientRegistratorListener {
        void onClientAdded(Client newClient, List<Client> clients);
    }

    class PrintClientListener implements ClientRegistratorListener {
        @Override
        public void onClientAdded(Client newClient, List<Client> clients) {
            clients.add( newClient );
            System.out.println( "PrintClientListener#ClientRegistratorListener" );
        }
    }

    class EmailNotificationListener implements ClientRegistratorListener {
        @Override
        public void onClientAdded(Client newClient, List<Client> clients) {
            System.out.println( "EmailNotificationListener#ClientRegistratorListener" );
        }
    }
}
