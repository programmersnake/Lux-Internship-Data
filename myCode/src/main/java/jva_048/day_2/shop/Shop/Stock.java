package jva_048.day_2.shop.Shop;

import java.util.HashMap;

public class Stock {

    private HashMap<Long, Product_Count> stock;

    public Stock() {
        stock = new HashMap<>();
    }

    public void addNewProductToStock(Product newProduct, int count) {
        if ( !stock.containsKey( newProduct.getID() ) ) {
            stock.put( newProduct.getID(), new Product_Count( newProduct, count ) );
        } else {
            stock.get( newProduct.getID() ).setCount( count );
        }
    }

    void removeAllProductsFromStock() {
        stock.clear();
    }

    void sellToCustomer(Basket basket) {
        for (Product_Count basketProduct_Count : basket.getProductList()) {
            long idProduct = basketProduct_Count.getProduct().getID();
            int countToBuy = basketProduct_Count.getCount();
            int countInTheStock = stock.get( idProduct ).getCount();

            if ( countInTheStock >= countToBuy ) {
                stock.get( idProduct ).addSoldCount( countToBuy );
                stock.get( idProduct ).setCount( countInTheStock - countToBuy );
            }
        }
    }

    void editPriceForSale(Product product, double newPrice) {
        if ( stock.containsValue( product ) ) {
            product.setPrice( newPrice );
        }
    }

    void getInfoAboutALLBirdsInTheShop() {
        StringBuffer buffer = new StringBuffer();
        stock.forEach( (index, product_count) -> {
            buffer.append( System.lineSeparator() );
            buffer.append( "№" + index.intValue() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Name: " + product_count.getProduct().getType() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Price for sale: " + product_count.getProduct().getPrice() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Price for purchase: " + product_count.getProduct().getPricePurchase() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Count in the Stock: " + product_count.getCount() );
            buffer.append( System.lineSeparator() );
            buffer.append( "   Was sold: " + product_count.getSoldCount() );
        } );

        System.out.println( buffer.toString() );
    }

    public HashMap<Long, Product_Count> getStock() {
        return stock;
    }
}
