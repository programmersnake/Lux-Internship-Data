package jva_048.day_1.generics.bankapp.domain;

import jva_048.day_1.generics.bankapp.exceptions.ClientExistsException;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bank {

    private final List<ClientRegistrationListener> listeners;
    private ClientStorageService<Client> storageService;

    private int printedClients = 0;
    private int emailedClients = 0;
    private int debuggedClients = 0;

    public Bank() {
        listeners = new ArrayList<>();
        listeners.add( new PrintClientListener() );
        listeners.add( new EmailNotificationListener() );
        listeners.add( new DebugListener() );

        storageService = new ClientStorageService<Client>();
    }

    public int getPrintedClients() {
        return printedClients;
    }

    public int getEmailedClients() {
        return emailedClients;
    }

    public int getDebuggedClients() {
        return debuggedClients;
    }

    public void setStorageService(ClientStorageService<Client> service) {
        storageService = service;
    }

    public void addClient(final Client client) throws ClientExistsException {
        storageService.store( client );
    }

    private boolean containsClient(Client clientToCheck) {
        for (Client c : storageService.getAll()) {
            if ( c.getName().equals( clientToCheck.getName() ) ) {
                return true;
            }
        }

        return false;
    }

    public List<Client> getClients() {
        return storageService.getAll();
    }

    private void notify(Client client) {
        for (ClientRegistrationListener listener : listeners) {
            listener.onClientAdded( client );
        }
    }

    class PrintClientListener implements ClientRegistrationListener {
        @Override
        public void onClientAdded(Client client) {
            System.out.println( "Client added: " + client.getName() );
            printedClients++;
        }

    }

    class EmailNotificationListener implements ClientRegistrationListener {
        @Override
        public void onClientAdded(Client client) {
            System.out.println( "Notification email for client " + client.getName() + " to be sent" );
            emailedClients++;
        }
    }

    class DebugListener implements ClientRegistrationListener {
        @Override
        public void onClientAdded(Client client) {
            System.out.println( "Client " + client.getName() + " added on: "
                    + DateFormat.getDateInstance( DateFormat.FULL ).format( new Date() ) );
            debuggedClients++;
        }
    }
}




