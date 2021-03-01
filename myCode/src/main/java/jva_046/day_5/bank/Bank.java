package jva_046.day_5.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Client> clients = new ArrayList<>();

    public Bank() {
    }

    public void addClient(Client newClient) {
        clients.add( newClient );
    }

    public List<Client> getClients() {
        return clients;
    }
}
