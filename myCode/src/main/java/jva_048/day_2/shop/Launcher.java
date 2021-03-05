package jva_048.day_2.shop;

import jva_048.day_2.shop.realization.ChickenShop;
import jva_048.day_2.shop.realization.Customer;
import jva_048.day_2.shop.realization.Product;
import jva_048.day_2.shop.realization.Shop;

public class Launcher {

    public static void main(String[] args) throws InterruptedException {
        Shop shop = new ChickenShop();
        Customer c1 = new Customer( "Denis" );
        Customer c2 = new Customer( "Anna" );

        shop.addNewCustomer( c1 );
        shop.addNewCustomer( c2 );

        Product crow = new Product( 1, "Crow", 40, 30 );
        Product chicken = new Product( 2, "Chicken", 15, 8 );
        Product falcon = new Product( 3, "Falcon", 35, 28 );
        Product duck = new Product( 4, "Duck", 17, 10 );
        Product turkey = new Product( 5, "Turkey", 20, 15 );

        shop.addNewProductToStock( crow, 15 );
        shop.addNewProductToStock( chicken, 25 );
        shop.addNewProductToStock( falcon, 30 );
        shop.addNewProductToStock( duck, 50 );
        shop.addNewProductToStock( turkey, 5 );

        Thread.sleep( 500 );

        shop.getInfoAllBirdsInTheShop();

        Thread.sleep( 500 );

        c1.addProductToBasket( crow, 1 );
        c1.addProductToBasket( chicken, 5 );
        c1.addProductToBasket( falcon, 3 );

        Thread.sleep( 500 );

        c2.addProductToBasket( crow, 2 );
        c2.addProductToBasket( chicken, 7 );
        c2.addProductToBasket( duck, 3 );
        c2.addProductToBasket( turkey, 1 );

        Thread.sleep( 500 );

        shop.sellToCustomer( c1, c1.getBasket() );
        shop.sellToCustomer( c2, c2.getBasket() );

        shop.getInfoAboutPastPurchases();

        shop.getInfoAllBirdsInTheShop();


        //

        shop.editPriceForSale( turkey, 100.11 );

        Thread.sleep( 500 );

        c1.addProductToBasket( chicken, 15 );
        c1.addProductToBasket( duck, 10 );
        c1.addProductToBasket( turkey, 2 );

        Thread.sleep( 500 );

        c2.addProductToBasket( falcon, 3 );
        c2.addProductToBasket( turkey, 2 );
        c2.addProductToBasket( duck, 4 );
        c2.addProductToBasket( turkey, 1 );

        Thread.sleep( 500 );

        shop.sellToCustomer( c1, c1.getBasket() );
        shop.sellToCustomer( c2, c2.getBasket() );

        shop.getInfoAboutPastPurchases();

        shop.getInfoAllBirdsInTheShop();


    }

}
