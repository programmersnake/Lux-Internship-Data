package jva_045.DAY_5_Birds_With_HashMap;

public interface BirdForSale {

    /**
     * Sell some [countForSell] birds
     * @param countForSell
     */
    void sell(int countForSell);

    /**
     * Sell 1 count
     */
    void sell();

    void buyToStock(int countForBuyToStock);

    void changeThePrice(double newPrice);

    String getInfoAboutThisBirdIntoTheShop();

    String getName();

    double getPriceUSD();

    int getCountInStock();

    int getSold();

    int getPricePurchase();

}

