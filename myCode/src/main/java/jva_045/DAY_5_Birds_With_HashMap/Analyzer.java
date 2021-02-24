package jva_045.DAY_5_Birds_With_HashMap;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Analyzer {

    private Stock stock;

    public Analyzer(Stock stock) {
        this.stock = stock;
    }

    public String getInfoAboutAllBirdsIntoTheShop() {
        StringBuffer buffer = new StringBuffer();
        for( BirdForSale birdType: stock.getStock().values()) {
            buffer.append( birdType.getInfoAboutThisBirdIntoTheShop() );
            buffer.append( System.lineSeparator() );
        }
        return buffer.toString();
    }

    public String listBirdsWhichMoreThanInputValue(int moreThanThisValue) {
        StringBuffer buffer = new StringBuffer();
        for( BirdForSale birdType: stock.getStock().values()) {
            if(birdType.getCountInStock()>moreThanThisValue) {
                buffer.append( birdType.getName() );
                buffer.append( "; " );
            }
        }
        return buffer.toString();
    }

    public String listBirdsWhichLessThanInputValue(int moreThanThisValue) {
        StringBuffer buffer = new StringBuffer();
        for( BirdForSale birdType: stock.getStock().values()) {
            if(birdType.getCountInStock()<moreThanThisValue) {
                buffer.append( birdType.getName() );
                buffer.append( "; " );
            }
        }
        return buffer.toString();
    }

    private String getAllSum() {
        int sum = 0;
        for( BirdForSale birdType: stock.getStock().values()) {
            sum += (birdType.getSold() * birdType.getPriceUSD());
        }
        return ("Было получено выручки на сумму: " + sum + " USD.");
    }


    public void printTableWithSale() {
        AtomicInteger sumSold = new AtomicInteger();
        AtomicInteger sumIncome = new AtomicInteger();

        ArrayList<BirdForSale> birdForSaleArrayList = getAllWhereSoldMoreThanZero();
        System.out.println("type | sold_count | price | income");
        birdForSaleArrayList.stream().forEach( birdForSale -> {
            System.out.println(birdForSale.getName() + " | " + birdForSale.getSold() + " | " + birdForSale.getPriceUSD() + " | " + (birdForSale.getSold() * birdForSale.getPriceUSD() ));
            sumSold.addAndGet( birdForSale.getSold() );
            sumIncome.addAndGet( (int) (birdForSale.getSold() * birdForSale.getPriceUSD()) );
        } );

        System.out.println("__________________________________");
        System.out.println("     | "   + sumSold + "   |    | " + sumIncome);
    }

    private ArrayList<BirdForSale> getAllWhereSoldMoreThanZero() {
        ArrayList<BirdForSale> birdForSaleArrayList = new ArrayList<>();
        for( BirdForSale birdType: stock.getStock().values()) {
            if(birdType.getSold()>0) {
                birdForSaleArrayList.add( birdType );
            }
        }
        return birdForSaleArrayList;
    }

}
