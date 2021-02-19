package JVA_045.DAY5_Birds;

import java.util.Arrays;

public class Birds {

    private final int Name_ID = 0;
    private final int PRICE_ID = 1;
    private final int COUNT_ID = 2;
    private final int SOLD_ID = 3;
    private final int PRICE_TO_STOCK_ID = 4;

    private String[][] birds = new String[100][];
    private int countOfBirds = 0;

    public void addBirdToStock(String type, int price, int count, int priceToStock) {
        String[] bird = createBird(type, price, count, priceToStock);
        buyToStock(bird);
    }

    public void printInfoAboutShop() {
        System.out.println();
        System.out.println("------------------INFO ABOUT SHOP------------------------------");

        for (int i = 0; i < countOfBirds; i++)
            System.out.println(getType(birds[i]) + " Цена: " + getPrice(birds[i]) + " Кол-во: " + getCount(birds[i]));

        System.out.println("----------------------------------------------------------------");
        System.out.println();
    }

    public void buyToStock (String[] bird) {
        doDoubleStock();
        String[] foundArrayStrings = find(getType(bird));
        if( foundArrayStrings !=null)
            addToCount( foundArrayStrings, getCount( bird ) );
        else
            birds[countOfBirds++] = bird;
        System.out.println("Купили на склад " + getCount( bird ) + " " + getType( bird ));
    }

    private void doDoubleStock() {
        if( birds.length * 0.9 > countOfBirds)
            birds = Arrays.copyOf( birds, birds.length * 2 );
    }

    public String[] createBird(String type, int price, int count, int priceToStock) {
        String[] bird = new String[5];

        bird[Name_ID] = type;
        bird[PRICE_ID] = String.valueOf(price);
        bird[COUNT_ID] = String.valueOf(count);
        bird[SOLD_ID] = "0";
        bird[PRICE_TO_STOCK_ID] = String.valueOf( priceToStock );

        return bird;
    }

    private String[] find(String type) {
        for (int i = 0; i < countOfBirds; i++) {
            String[] bird = birds[i];
            if (getType(bird).equals(type))
                return bird;
        }
        return null;
    }

    private void addToCount(String[] bird, int count) {
        bird[COUNT_ID] = String.valueOf(getCount(bird) + count);
    }

    private String getType(String[] bird) {
        return bird[Name_ID];
    }

    private int getPrice(String[] bird) {
        return Integer.parseInt(bird[PRICE_ID]);
    }

    private int getCount(String[] bird) {
        return Integer.parseInt(bird[COUNT_ID]);
    }

    public void sellFromStock(String type, int count) {
        String[] bird = find(type);

        if (bird == null || getCount(bird) == 0)
            System.err.println("Этих птиц нет на складе!");
        else {
            sell( bird, count );
            System.out.println( "Кол-во птиц " + count + " " + type + "; Цена: " + getPrice( bird ) );
        }
    }

    private void sell(String[] bird, int count) {
        addToCount(bird, -count);
        addToSoldCount(bird, count);
    }

    private void addToSoldCount(String[] bird, int countSold) {
        bird[SOLD_ID] = String.valueOf(getSold(bird) + countSold);
    }

    private int getSold(String[] bird) {
        return Integer.parseInt(bird[SOLD_ID]);
    }

    public static void main(String[] args) {
        Birds birds = new Birds();
        birds.printInfoAboutShop();
        birds.addBirdToStock("Курица", 5, 50, 2);
        birds.addBirdToStock( "Орел", 50, 5, 30 );
        birds.addBirdToStock("Утка", 10, 20, 5);
        birds.printInfoAboutShop();
        birds.addBirdToStock("Сокол", 40, 10, 20);
        birds.printInfoAboutShop();
    }

}
