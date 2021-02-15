package com.luxoft.jva001p1.cafe;

public class Ingredient
{
    private String name;

    private double price;

    public Ingredient()
    {
    }

    public Ingredient(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
