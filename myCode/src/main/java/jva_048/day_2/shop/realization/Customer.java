package jva_048.day_2.shop.realization;

public class Customer {

    private String name;
    private Basket basket;

    public Customer(String name) {
        this.name = name;
        basket = new Basket();
    }

    public void addProductToBasket(Product newProduct, int count) {
        basket.addProduct( newProduct, count );
    }

    public void clearBasket() {
        basket.clearBasket();
    }

    public Basket getBasket() {
        return basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
