package jva_046.day_3.cafe;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Ingredient lemon = new Ingredient();
        lemon.setName( "Lemon" );
        lemon.setPrice( 3 );

        Ingredient coffeeArabica = new Ingredient();
        coffeeArabica.setName( "Coffee Arabica" );
        coffeeArabica.setPrice( 15 );

        Ingredient cheapCoffee = new Ingredient();
        cheapCoffee.setName( "Cheap Coffee" );
        cheapCoffee.setPrice( 5 );

        Ingredient greenTea = new Ingredient();
        greenTea.setName( "Green Tea" );
        greenTea.setPrice( 10 );

        Ingredient blackTea = new Ingredient();
        blackTea.setName( "Black Tea" );
        blackTea.setPrice( 12 );

        Ingredient sugar = new Ingredient();
        sugar.setName( "Sugar" );
        sugar.setPrice( 0 );

        Drink coffeeSimple = new Drink();
        coffeeSimple.addIngredient( cheapCoffee );
        coffeeSimple.addIngredient( sugar );
        coffeeSimple.setName( "Simple Coffee" );
        coffeeSimple.setSize( 1 );

        Drink americano = new Drink();
        americano.addIngredient( coffeeArabica );
        americano.addIngredient( sugar );
        americano.setName( "Americano" );
        americano.setSize( 1 );

        Drink greenTeaDrink = new Drink();
        greenTeaDrink.addIngredient( greenTea );
        greenTeaDrink.addIngredient( sugar );
        greenTeaDrink.setName( "Green Tea" );
        greenTeaDrink.setSize( 1 );

        Drink blackTeaDrink = new Drink();
        blackTeaDrink.addIngredient( blackTea );
        blackTeaDrink.addIngredient( sugar );
        blackTeaDrink.setName( "Black Tea" );
        blackTeaDrink.setSize( 1 );

        Menu menu = new Menu();
        menu.addDrink( coffeeSimple );
        menu.addDrink( americano );
        menu.addDrink( greenTeaDrink );
        menu.addDrink( blackTeaDrink );

        menu.displayMenu();

        ArrayList<Ingredient> customDrinkIngredientList1 = new ArrayList<>();
        customDrinkIngredientList1.add( greenTea );
        customDrinkIngredientList1.add( blackTea );
        customDrinkIngredientList1.add( sugar );

        menu.createCustomDrink( "SuperTea", customDrinkIngredientList1, 2 );

        ArrayList<Ingredient> customDrinkIngredientList2 = new ArrayList<>();
        customDrinkIngredientList2.add( cheapCoffee );
        customDrinkIngredientList2.add( coffeeArabica );
        customDrinkIngredientList2.add( sugar );

        menu.createCustomDrink( "SuperCoffee", customDrinkIngredientList1, 3 );

        menu.displayMenu();
        menu.displayCustomMenu();

        menu.printDrink( coffeeSimple );

    }

}
