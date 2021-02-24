package jva_045.DAY_5_Birds_With_HashMap;

public class DAY_5 {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Analyzer analyzer = new Analyzer( stock );

        BirdForSale duck = new BirdTypeInfo( "Duck", 10, 20, 0, 5 );
        BirdForSale eagle = new BirdTypeInfo( "Eagle", 15, 15, 0, 7 );
        BirdForSale falcon = new BirdTypeInfo( "Falcon", 30, 5, 0, 10 );
        stock.addNewBird( 1, duck );
        stock.addNewBird( 2, eagle );
        stock.addNewBird( 3, falcon );

        stock.sell( 1, 10 );
        stock.sell( 2, 5 );
        stock.sell( 3 );

        analyzer.printTableWithSale();

    }

}
