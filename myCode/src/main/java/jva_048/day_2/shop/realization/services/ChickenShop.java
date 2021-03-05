package jva_048.day_2.shop.realization.services;

import jva_048.day_2.shop.realization.entities.Basket;
import jva_048.day_2.shop.realization.entities.Customer;
import jva_048.day_2.shop.realization.entities.HistoryBasket;
import jva_048.day_2.shop.realization.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class ChickenShop implements Shop {

    private Stock stock;
    private Map<Customer, HistoryBasket> basketsHistory;
    private Report reporter;

    public ChickenShop() {
        stock = new Stock();
        basketsHistory = new HashMap<>();
        reporter = new Reporter();
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

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setReporter(Report reporter) {
        this.reporter = reporter;
    }

    @Override
    public void getInfoAllBirdsInTheShop() {
        System.out.println();
        System.out.print( "-----SHOP_INFO-----" );
        stock.getInfoAboutALLBirdsInTheShop();
        System.out.println();
    }

    public void getInfoAboutPastPurchases() {
        reporter.getInfoAboutPastPurchases( basketsHistory );
    }

}
