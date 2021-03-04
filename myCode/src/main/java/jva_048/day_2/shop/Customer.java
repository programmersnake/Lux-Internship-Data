package jva_048.day_2.shop;

import java.util.List;

public class Customer {

    private String name;
    private Basket basket;
    private BoughtBasket historyBasket;

    public Customer(String name) {
        this.name = name;
        basket = new Basket();
        historyBasket = new BoughtBasket();
    }

    public void addProductToBasket(Product newProduct, int count) {
        basket.addProduct( newProduct, count );
    }

    public void getInfoAboutPastPurchases() {
        StringBuffer buffer = new StringBuffer();
        List<Basket> history = historyBasket.getHistory();
        List<String> times = historyBasket.getTimes();

        buffer.append( "Customer name: " + name );

        for (int i = 0; i < history.size(); i++) {
            buffer.append( System.lineSeparator() );
            buffer.append( "#" + i );
            buffer.append( " [Time: " + times.get( i ) + "]" );
            buffer.append( System.lineSeparator() );
            buffer.append( "    Type: " + history.get( i ).getProductList() );
        }

        System.out.println( buffer.toString() );
    }

    public void clearBasket() {
        historyBasket.toHistory( basket );
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
