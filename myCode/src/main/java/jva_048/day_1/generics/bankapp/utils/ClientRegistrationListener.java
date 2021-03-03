package jva_048.day_1.generics.bankapp.utils;

import jva_048.day_1.generics.bankapp.domain.Client;

public interface ClientRegistrationListener {
    void onClientAdded(Client client);
}
