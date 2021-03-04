package jva_048.day_2.shop.Shop;

public class Product_Count {

    private Product product;
    private int count;
    private int soldCount;

    public Product_Count(Product product, int count) {
        this.product = product;
        this.count = count;
        soldCount = 0;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public void addSoldCount(int countSold) {
        soldCount += countSold;
    }

    @Override
    public String toString() {
        return "Product_Count{" +
                "product=" + product +
                ", count=" + count +
                ", soldCount=" + soldCount +
                '}';
    }
}
