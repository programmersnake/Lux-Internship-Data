package JVA_046.day_2.fridge;

import java.util.ArrayList;

public class Fridge {

    private String modelName;
    private double price;
    private String color;

    private ArrayList<Meal> meals;

    public String getName() {
        return modelName;
    }

    public void setName(String name) {
        this.modelName = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }
}
