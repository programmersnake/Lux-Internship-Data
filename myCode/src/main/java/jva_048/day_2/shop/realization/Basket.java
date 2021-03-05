package jva_048.day_2.shop.realization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {

    private List<Product_Count> basket;

    public Basket() {
        basket = new ArrayList<>();
    }

    public void addProduct(Product newProduct, int count) {
        basket.add( new Product_Count( newProduct, count ) );
    }

    public void clearBasket() {
        basket = new ArrayList<>();
    }

    public List<Product_Count> getProductList() {
        return Collections.unmodifiableList( basket );
    }

    public void setBasket(List<Product_Count> basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                '}';
    }
}
