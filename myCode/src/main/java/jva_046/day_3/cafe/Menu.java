package jva_046.day_3.cafe;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Drink> menu = new ArrayList<>();
    private ArrayList<Drink> customMenu = new ArrayList<>();

    public Menu() {}

    public void addDrink(Drink newDrink) {
        menu.add( newDrink );
    }

    public void removeDrink(Drink drink) {
        if( menu.contains( drink ) ) {
            menu.remove( drink );
        }
    }

    public void createCustomDrink(String name, ArrayList<Ingredient> ingredients, int size) {
        Drink customDrink = new Drink();
        customDrink.setIngredients( ingredients );
        customDrink.setSize( size );
        customDrink.setName( name );

        customMenu.add( customDrink );
    }

    public void displayMenu() {
        System.out.println();
        System.out.println();
        System.out.println("----------MENU----------");
        int index = 1;
        for (Drink drink : menu) {
            System.out.println( index + ") Name: " + drink.getName() );
            System.out.println(" Price: " + drink.getPrice());
            System.out.println(" Size: " + drink.getSize());
            System.out.println(" Ingredients: " + drink.getIngredientsText());
            System.out.println();
            index++;
        }
    }

    public void displayCustomMenu() {
        System.out.println();
        System.out.println();
        System.out.println("----------CUSTOM_MENU----------");
        int index = 1;
        for (Drink drink : customMenu) {
            System.out.println( index + ") Name: " + drink.getName() );
            System.out.println(" Price: " + drink.getPrice());
            System.out.println(" Size: " + drink.getSize());
            System.out.println(" Ingredients: " + drink.getIngredientsText());
            System.out.println();
        }
    }

    public void printDrink(Drink drink) {
        System.out.println("-----CHECK-----");
        System.out.println(" Name: " + drink.getName() );
        System.out.println(" Price: " + drink.getPrice());
        System.out.println(" Size: " + drink.getSize());
        System.out.println(" Ingredients: " + drink.getIngredientsText());
        System.out.println();
    }

    public ArrayList<Drink> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Drink> menu) {
        this.menu = menu;
    }
}
