package jva_048.day_2.shop.realization.services;

import jva_048.day_2.shop.realization.entities.Customer;
import jva_048.day_2.shop.realization.entities.HistoryBasket;

import java.util.Map;

public interface Report {

    void getInfoAboutPastPurchases(Map<Customer, HistoryBasket> basketsHistory);

}
