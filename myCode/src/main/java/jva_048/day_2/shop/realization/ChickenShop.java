package jva_048.day_2.shop.realization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChickenShop implements Shop {

    private Stock stock;
    private Map<Customer, HistoryBasket> basketsHistory;

    public ChickenShop() {
        stock = new Stock();
        basketsHistory = new HashMap<>();
    }

    @Override
    public void addNewCustomer(Customer newCustomer) {
        if ( !basketsHistory.containsKey( newCustomer ) )
            basketsHistory.put( newCustomer, new HistoryBasket() );
    }

    @Override
    public void removeCustomer(Customer customer) {
        if ( basketsHistory.containsKey( customer ) )
            basketsHistory.remove( customer );
    }

    @Override
    public void addNewProductToStock(Product newProduct, int count) {
        stock.addNewProductToStock( newProduct, count );
    }

    @Override
    public void removeAllProductsFromStock() {
        stock.removeAllProductsFromStock();
    }

    @Override
    public void sellToCustomer(Customer customer, Basket basket) {
        if ( basketsHistory.containsKey( customer ) ) {
            stock.sellToCustomer( basket );
            basketsHistory.get( customer ).toHistory( basket );
            customer.clearBasket();
        }
    }

    @Override
    public void editPriceForSale(Product product, double newPrice) {
        stock.editPriceForSale( product, newPrice );
    }

    @Override
    public void getInfoAllBirdsInTheShop() {
        System.out.println();
        System.out.print( "-----SHOP_INFO-----" );
        stock.getInfoAboutALLBirdsInTheShop();
        System.out.println();
    }

    public void getInfoAboutPastPurchases() {
        StringBuffer buffer = new StringBuffer();

        buffer.append( System.lineSeparator() );
        buffer.append( "-----HISTORY_BASKET-----" );

        basketsHistory.forEach( (customer, boughtBasket) -> {
            List<String> history = boughtBasket.getHistory();
            List<String> times = boughtBasket.getTimes();

            buffer.append( System.lineSeparator() );
            buffer.append( "---Customer name: " + customer.getName() + "---" );

            for (int i = 0; i < history.size(); i++) {
                buffer.append( System.lineSeparator() );
                buffer.append( "№" + i );
                buffer.append( " [Time: " + times.get( i ) + "]" );
                buffer.append( System.lineSeparator() );
                buffer.append( "    Type: " + history.get( i ) );
            }

        } );

        System.out.println( buffer.toString() );
    }

}
