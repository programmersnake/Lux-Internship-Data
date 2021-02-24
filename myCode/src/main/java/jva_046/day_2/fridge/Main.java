package jva_046.day_2.fridge;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Meal> meals = new ArrayList<>();
        Fridge fridge = new Fridge();
        fridge.setName( "Tefal" );
        fridge.setPrice( 669.99 );
        fridge.setColor( "Gray" );

        Meal m1 = new Meal();
        m1.setName( "Bread" );
        m1.setColor( "brown" );
        m1.setPrice( 5.5 );
        m1.setType( "bakery" );

        Meal m2 = new Meal();
        m2.setName( "Milk" );
        m2.setColor( "white" );
        m2.setPrice( 13.5 );
        m2.setType( "milk" );

        Meal m3 = new Meal();
        m3.setName( "Cheese" );
        m3.setColor( "yellow" );
        m3.setPrice( 16.0 );
        m3.setType( "milk" );

        Meal m4 = new Meal();
        m4.setName( "Tomato" );
        m4.setColor( "red" );
        m4.setPrice( 4.0 );
        m4.setType( "vegetable" );

        Meal m5 = new Meal();
        m5.setName( "Apple" );
        m5.setColor( "green" );
        m5.setPrice( 4.5 );
        m5.setType( "fruit" );

        meals.add( m1 );
        meals.add( m2 );
        meals.add( m3 );
        meals.add( m4 );
        meals.add( m5 );

        fridge.setMeals( meals );

        System.out.println(fridge.getName() + "; Color: " + fridge.getColor() + "; Price: " + fridge.getPrice() + "; Meals: " +fridge.getMeals());

        System.out.println("___Final___");
        System.out.println();
        printCountOfTheMeals( fridge );
        System.out.println();
        printMealsWhichColorEqualsToInputValue( fridge, "red" );
        System.out.println();
        printMealsWhichPriceMoreThanInputValue( fridge, 4.2 );
        System.out.println();
        printMealsWhichTypeEqualsToInputValue( fridge, "milk" );

    }

    public static void printCountOfTheMeals(Fridge fridge) {
        System.out.println("The Fridge " + fridge.getName() + " have " + fridge.getMeals().size() + " meals");
    }

    public static void printMealsWhichPriceMoreThanInputValue(Fridge fridge, double price) {
        System.out.println("Meals (more than "+price+"):");
        for (Meal meal: fridge.getMeals()) {
            if(meal.getPrice()>price) {
                System.out.println(meal.getName() + " " + meal.getPrice());
            }
        }
    }

    public static void printMealsWhichTypeEqualsToInputValue(Fridge fridge, String type) {
        System.out.println("Meals (type is "+type+"):");
        for (Meal meal: fridge.getMeals()) {
            if(meal.getType().equals( type )) {
                System.out.println(meal.getName() + " " + meal.getPrice() + " " + meal.getType());
            }
        }
    }

    public static void printMealsWhichColorEqualsToInputValue(Fridge fridge, String color) {
        System.out.println("Meals (color is "+color+"):");
        for (Meal meal: fridge.getMeals()) {
            if(meal.getColor().equals( color )) {
                System.out.println(meal.getName() + " " + meal.getPrice() + " " + meal.getColor());
            }
        }
    }
}

