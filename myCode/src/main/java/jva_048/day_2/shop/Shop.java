package jva_048.day_2.shop;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ShopInterface {

    private Stock stock;
    private List<Customer> customers;
    //private HashMap<Customer, >

    public Shop() {
        stock = new Stock();
        customers = new ArrayList<>();
    }

    @Override
    public void addNewCustomer(Customer newCustomer) {
        customers.add( newCustomer );
    }

    @Override
    public void removeCustomer(Customer customer) {
        customers.remove( customer );
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
        if ( customers.contains( customer ) ) {
            stock.sellToCustomer( basket );
            customer.clearBasket();
        }
    }

    @Override
    public void getInfoAllBirdsInTheShop() {
        System.out.println();
        System.out.print( "-----SHOP_INFO-----" );
        stock.getInfoAboutALLBirdsInTheShop();
    }


}
