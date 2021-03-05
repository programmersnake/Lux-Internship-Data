package jva_048.day_2.shop.realization.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {

    private List<Product> basketList;

    public Basket() {
        basketList = new ArrayList<>();
    }

    public void addProduct(Product newProduct, int count) {
        newProduct.setCountInTheStock( count );
        basketList.add( newProduct );
    }

    public void clearBasket() {
        basketList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return Collections.unmodifiableList( basketList );
    }

    public void setBasket(List<Product> basket) {
        this.basketList = basket;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketList=" + basketList +
                '}';
    }
}
