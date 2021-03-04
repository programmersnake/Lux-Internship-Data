package jva_048.day_2.shop;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BoughtBasket {

    private List<Basket> history;
    private List<String> times;

    public BoughtBasket() {
        history = new ArrayList<>();
        times = new ArrayList<>();
    }

    public void toHistory(Basket basket) {
        Basket tempBasket = new Basket();
        tempBasket.setBasket( basket.getProductList() );
        history.add( tempBasket );
        times.add( LocalTime.now().toString().substring( 0, 8 ) );
    }

    public List<Basket> getHistory() {
        return history;
    }

    public List<String> getTimes() {
        return times;
    }

}
