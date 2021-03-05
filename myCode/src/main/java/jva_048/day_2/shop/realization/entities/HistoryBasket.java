package jva_048.day_2.shop.realization.entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistoryBasket {

    private List<List<Product>> historyBasket;
    private List<Double> totalPriceList;
    private List<String> timeList;

    public HistoryBasket() {
        historyBasket = new ArrayList<>();
        totalPriceList = new ArrayList<>();
        timeList = new ArrayList<>();
    }

    public void toHistory(Basket basket) {
        List<Product> productList = Collections.unmodifiableList( basket.getProductList() );
        historyBasket.add( productList );
        totalPriceList.add( totalPriceInTheBasket( basket ) );
        timeList.add( LocalTime.now().toString().substring( 0, 8 ) );
    }

    private double totalPriceInTheBasket(Basket basket) {
        double totalPrice = 0.0;
        for (Product product : basket.getProductList()) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }

    public List<List<Product>> getHistoryBasket() {
        return historyBasket;
    }

    public List<String> getTimeList() {
        return timeList;
    }

    public List<Double> getTotalPriceList() {
        return totalPriceList;
    }
}
