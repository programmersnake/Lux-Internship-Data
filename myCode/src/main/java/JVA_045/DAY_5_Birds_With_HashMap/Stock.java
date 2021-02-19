package JVA_045.DAY_5_Birds_With_HashMap;

import java.util.HashMap;
import java.util.Set;

public class Stock {

    private HashMap<Integer, BirdForSale> stock = new HashMap<>();

    public void sell(int ID, int countForSell) {
        stock.get( Integer.valueOf( ID ) ).sell(countForSell);
    }

    public HashMap<Integer, BirdForSale> getStock() {
        return stock;
    }

    /**
     * Sell 1 count
     */
    public void sell(int ID) {
        stock.get( Integer.valueOf( ID ) ).sell();
    }

    public void buyToStock(int ID, int countForBuyToStock) {
        stock.get( Integer.valueOf( ID ) ).buyToStock( countForBuyToStock );
    }

    public void changeThePrice(int ID, double newPrice) {
        stock.get( Integer.valueOf( ID ) ).changeThePrice( newPrice );
    }

    public void addNewBird(int ID, BirdForSale newBird) {
        stock.put( ID, newBird );
    }

    public String getAllId_Name() {
        Set<Integer> keySet = stock.keySet();
        BirdForSale[] values = stock.values().toArray(BirdForSale[]::new);
        StringBuffer buffer = new StringBuffer();
        keySet.stream().forEach( integer -> {

            buffer.append( "[" + integer + " - " + values[0].getName() + " ]" );
            buffer.append( System.lineSeparator() );

        } );
        return buffer.toString();
    }

}
