package jva_045.DAY_5_Birds_With_HashMap;

public class BirdTypeInfo implements BirdForSale {

    private String name;
    private double priceUSD;
    private int countInStock;
    private int sold;
    private int pricePurchase;

    public BirdTypeInfo(String name, double priceUSD, int countInStock, int sold, int pricePurchase) {
        this.name = name;
        this.priceUSD = priceUSD;
        this.countInStock = countInStock;
        this.sold = sold;
        this.pricePurchase = pricePurchase;
    }

    public BirdTypeInfo(String name, double priceUSD, int countInStock, int sold) {
        this.name = name;
        this.priceUSD = priceUSD;
        this.countInStock = countInStock;
        this.sold = sold;
    }

    @Override
    public void sell(int countForSell) {
        if(countInStock>=countForSell) {
            countInStock -= countForSell;
            sold += countForSell;
        }
        else {
            System.err.println("You can`t sell more than you have inSock!" + " Bird name: " + name + "; CountForSell: " + countForSell + "; CountInnStock: " + countInStock);
        }
    }

    @Override
    public void sell() {
        if(countInStock>=1) {
            countInStock -= 1;
            sold += 1;
        }
        else {
            System.err.println("You can`t sell more than you have inSock!" + " Bird name: " + name + "; CountForSell: " + 1 + "; CountInnStock: " + countInStock);
        }
    }

    @Override
    public void buyToStock(int countForBuyToStock) {
        if(countForBuyToStock>=1) {
            countInStock += countForBuyToStock;
        }
    }

    @Override
    public void changeThePrice(double newPrice) {
        this.priceUSD = newPrice;
    }

    @Override
    public String getInfoAboutThisBirdIntoTheShop() {
        StringBuffer buffer = new StringBuffer();
        buffer.append( "Name: " + name );
        buffer.append( "; Price for sale: " + priceUSD );
        buffer.append( "; Price for purchase: " + pricePurchase );
        buffer.append( "; Count in the Stock: " + countInStock );
        buffer.append( "; Sold: " + sold );
        return buffer.toString();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPriceUSD() {
        return priceUSD;
    }

    @Override
    public int getCountInStock() {
        return countInStock;
    }

    @Override
    public int getSold() {
        return sold;
    }

    @Override
    public int getPricePurchase() {
        if(pricePurchase!=0)
            return pricePurchase;
        return -1;
    }
}
