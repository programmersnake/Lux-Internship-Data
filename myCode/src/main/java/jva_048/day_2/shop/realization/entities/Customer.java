package jva_048.day_2.shop.realization.entities;

public class Customer {

    private String name;
    private Basket basket = null;

    public Customer(String name) {
        this.name = name;
    }

    public void addProductToBasket(Product newProduct, int count) {
        if ( basket == null )
            basket = new Basket();
        basket.addProduct( newProduct, count );
    }

    public void clearBasket() {
        basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
