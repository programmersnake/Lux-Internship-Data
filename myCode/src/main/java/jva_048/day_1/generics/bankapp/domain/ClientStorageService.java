package jva_048.day_1.generics.bankapp.domain;

import java.util.ArrayList;
import java.util.List;

public class ClientStorageService<T> {

    private List<Client> clients;

    public ClientStorageService() {
        clients = new ArrayList<>();
    }

    public T store(T client) {
        clients.add( (Client) client );
        return client;
    }

    public T getById(int id) {
        return (T) clients.get( id );
    }

    public T update(T clientToUpdate) {
        if ( clients.contains( clientToUpdate ) )
            clients.add( (Client) clientToUpdate );
        return clientToUpdate;
    }

    public void delete(T client) {
        clients.remove( client );
    }

    public List<T> getAll() {
        return (List<T>) clients;
    }
}
