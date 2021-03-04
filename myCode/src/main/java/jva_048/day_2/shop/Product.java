package jva_048.day_2.shop;

public class Product {

    private long ID;
    private String type;
    private double price;
    private int pricePurchase;

    public Product(long ID, String type, double priceUSD, int pricePurchase) {
        this.ID = ID;
        this.type = type;
        this.price = priceUSD;
        this.pricePurchase = pricePurchase;
    }

    public long getID() {
        return ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPricePurchase() {
        return pricePurchase;
    }

    public void setPricePurchase(int pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", pricePurchase=" + pricePurchase +
                '}';
    }
}
