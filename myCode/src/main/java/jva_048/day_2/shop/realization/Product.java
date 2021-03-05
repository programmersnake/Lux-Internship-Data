package jva_048.day_2.shop.realization;

public class Product {

    private long id;
    private String type;
    private double price;
    private int pricePurchase;
    private int countInTheStock;
    private int soldCount;

    public Product(long id, String type, double priceUSD, int pricePurchase) {
        this.id = id;
        this.type = type;
        this.price = priceUSD;
        this.pricePurchase = pricePurchase;
    }

    public long getId() {
        return id;
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

    public int getCountInTheStock() {
        return countInTheStock;
    }

    public void setCountInTheStock(int countInTheStock) {
        this.countInTheStock = countInTheStock;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(int soldCount) {
        this.soldCount = soldCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", pricePurchase=" + pricePurchase +
                ", countInTheStock=" + countInTheStock +
                ", soldCount=" + soldCount +
                '}';
    }
}
