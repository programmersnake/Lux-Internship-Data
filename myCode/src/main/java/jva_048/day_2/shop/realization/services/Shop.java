package jva_048.day_2.shop.realization.services;

import jva_048.day_2.shop.realization.entities.Basket;
import jva_048.day_2.shop.realization.entities.Customer;
import jva_048.day_2.shop.realization.entities.Product;

public interface Shop {

    void addNewCustomer(Customer newCustomer);

    void removeCustomer(Customer customer);

    void sellToCustomer(Customer customer, Basket basket);

    void addNewProductToStock(Product newProduct, int count);

    void editPriceForSale(Product product, double newPrice);

    void removeAllProductsFromStock();

    void getInfoAllBirdsInTheShop();

    void getInfoAboutPastPurchases();

}
