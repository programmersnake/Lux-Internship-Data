package jva_046.day_3.cafe;

import java.util.ArrayList;

public class Drink {

    private String name;

    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    private double price = 0.0;

    private int size = 1;

    public Drink() {}

    public Drink(String name, ArrayList<Ingredient> ingredients, double price, int size) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.size = size;
    }

    public void addIngredient(Ingredient newIngredient) {
        ingredients.add( newIngredient );
        editPrice();
    }

    public void removeIngredient(Ingredient ingredient) {
        if( ingredients.contains( ingredient ) ) {
            ingredients.remove( ingredient );
            editPrice();
        }
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getIngredientsText() {
        StringBuffer buffer = new StringBuffer();
        buffer.append( "[ " );
        int index = 0;
        for (Ingredient ingredient : ingredients) {
            if ( index!=0 )
                buffer.append( ", " );
            buffer.append( ingredient.getName() + "( " + ingredient.getPrice() + " ) " );
            index++;
        }
        buffer.append( "]" );
        return buffer.toString();
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
        editPrice();
    }

    private void editPrice() {
        price = 0.0;
        for (Ingredient ingredient : this.ingredients) {
            price += ingredient.getPrice();
        }
        price *= size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        editPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
