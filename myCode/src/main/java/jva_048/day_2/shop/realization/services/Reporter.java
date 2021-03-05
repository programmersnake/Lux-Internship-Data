package jva_048.day_2.shop.realization.services;

import jva_048.day_2.shop.realization.entities.Customer;
import jva_048.day_2.shop.realization.entities.HistoryBasket;
import jva_048.day_2.shop.realization.entities.Product;

import java.util.List;
import java.util.Map;

public class Reporter implements Report {

    @Override
    public void getInfoAboutPastPurchases(Map<Customer, HistoryBasket> basketsHistory) {
        StringBuffer buffer = new StringBuffer();

        buffer.append( System.lineSeparator() );
        buffer.append( "-----HISTORY_BASKET-----" );

        basketsHistory.forEach( (customer, historyBasket) -> {
            List<List<Product>> history = historyBasket.getHistoryBasket();
            List<Double> totalPrices = historyBasket.getTotalPriceList();
            List<String> times = historyBasket.getTimeList();

            buffer.append( System.lineSeparator() );
            buffer.append( "---Customer name: " ).append( customer.getName() ).append( "---" );

            for (int i = 0; i < history.size(); i++) {
                buffer.append( System.lineSeparator() );
                buffer.append( "№" ).append( i );
                buffer.append( " [Time: " ).append( times.get( i ) ).append( "]" );
                buffer.append( System.lineSeparator() );
                buffer.append( "    Total price: " ).append( totalPrices.get( i ) );
                buffer.append( System.lineSeparator() );
                buffer.append( "    Transaction: " );
                buffer.append( System.lineSeparator() );
                buffer.append( "_____________________________________________________________ " );
                buffer.append( System.lineSeparator() );
                buffer.append( "| type | price | Price Purchase | CountInStock | CountWasBuy | " );
                buffer.append( System.lineSeparator() );
                buffer.append( history.get( i ) );
                buffer.append( System.lineSeparator() );
                buffer.append( "_____________________________________________________________ " );
            }

        } );

        System.out.println( buffer.toString() );
    }

}
