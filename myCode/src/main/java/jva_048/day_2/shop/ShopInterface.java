package jva_048.day_2.shop;

public interface ShopInterface {

    void addNewCustomer(Customer newCustomer);

    void removeCustomer(Customer customer);

    void sellToCustomer(Customer customer, Basket basket);

    void addNewProductToStock(Product newProduct, int count);

    void removeAllProductsFromStock();

    void getInfoAllBirdsInTheShop();

}
