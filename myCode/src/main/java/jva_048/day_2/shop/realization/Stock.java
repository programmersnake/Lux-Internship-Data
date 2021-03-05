package jva_048.day_2.shop.realization;

import java.util.HashMap;

public class Stock {

    private HashMap<Long, Product> stock;

    public Stock() {
        stock = new HashMap<>();
    }

    public void addNewProductToStock(Product newProduct, int count) {
        if ( !stock.containsKey( newProduct.getId() ) ) {
            newProduct.setCountInTheStock( count );
            stock.put( newProduct.getId(), newProduct );
        } else {
            stock.get( newProduct.getId() ).setCountInTheStock( count );
        }
    }

    void removeAllProductsFromStock() {
        stock.clear();
    }

    void sellToCustomer(Basket basket) {
        for (Product basketProduct_Count : basket.getProductList()) {
            long idProduct = basketProduct_Count.getId();
            int countToBuy = basketProduct_Count.getCountInTheStock();
            if ( stock.containsKey( idProduct ) ) {
                int countInTheStock = stock.get( idProduct ).getCountInTheStock();

                if ( countInTheStock >= countToBuy ) {
                    int newSoldCount = stock.get( idProduct ).getSoldCount() + countToBuy;
                    int newCountInTheStock = countInTheStock - countToBuy;

                    stock.get( idProduct ).setSoldCount( newSoldCount );
                    stock.get( idProduct ).setCountInTheStock( newCountInTheStock );
                }
            }
        }
    }

    void editPriceForSale(Product product, double newPrice) {
        product.setPrice( newPrice );
    }

    void getInfoAboutALLBirdsInTheShop() {
        StringBuffer buffer = new StringBuffer();
        stock.forEach( (index, product_count) -> {
            buffer.append( System.lineSeparator() );
            buffer.append( "№" + index.intValue() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Name: " + product_count.getType() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Price for sale: " + product_count.getPrice() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Price for purchase: " + product_count.getPricePurchase() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Count in the Stock: " + product_count.getCountInTheStock() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Was sold: " + product_count.getSoldCount() );
        } );

        System.out.println( buffer.toString() );
    }

    public HashMap<Long, Product> getStock() {
        return stock;
    }
}
