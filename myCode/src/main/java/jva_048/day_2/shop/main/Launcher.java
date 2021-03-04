package jva_048.day_2.shop.main;

import jva_048.day_2.shop.Customer;
import jva_048.day_2.shop.Product;
import jva_048.day_2.shop.Shop;
import jva_048.day_2.shop.ShopInterface;

public class Launcher {

    public static void main(String[] args) {
        ShopInterface shop = new Shop();
        Customer c1 = new Customer( "Denis" );
        Customer c2 = new Customer( "Anna" );

        shop.addNewCustomer( c1 );
        shop.addNewCustomer( c2 );

        Product crow = new Product( 1, "Crow", 10, 5 );
        Product parrot = new Product( 2, "Parrot", 15, 8 );

        shop.addNewProductToStock( crow, 15 );
        shop.addNewProductToStock( parrot, 25 );

        //

        shop.getInfoAllBirdsInTheShop();

        shop.sellToCustomer( c1, c1.getBasket() );
        shop.sellToCustomer( c2, c2.getBasket() );

        c1.addProductToBasket( crow, 3 );
        c1.addProductToBasket( parrot, 2 );

        c2.addProductToBasket( crow, 2 );
        c2.addProductToBasket( parrot, 3 );

        shop.sellToCustomer( c1, c1.getBasket() );
        shop.sellToCustomer( c2, c2.getBasket() );

        shop.getInfoAllBirdsInTheShop();

        //

        c1.getInfoAboutPastPurchases();
        c2.getInfoAboutPastPurchases();

    }

}
