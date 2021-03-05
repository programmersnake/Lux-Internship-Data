package jva_048.day_2.shop.realization;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BoughtBasket {

    private List<String> history;
    private List<String> times;

    public BoughtBasket() {
        history = new ArrayList<>();
        times = new ArrayList<>();
    }

    public void toHistory(Basket basket) {
        StringBuffer buffer = new StringBuffer();
        buffer.append( basket.toString() );
        buffer.append( ". Total price: " + totalPriceInTheBasket( basket ) );

        history.add( buffer.toString() );
        times.add( LocalTime.now().toString().substring( 0, 8 ) );
    }

    private double totalPriceInTheBasket(Basket basket) {
        double totalPrice = 0.0;
        for (Product_Count product_count : basket.getProductList()) {
            totalPrice += product_count.getProduct().getPrice();
        }

        return totalPrice;
    }

    public List<String> getHistory() {
        return history;
    }

    public List<String> getTimes() {
        return times;
    }

}
