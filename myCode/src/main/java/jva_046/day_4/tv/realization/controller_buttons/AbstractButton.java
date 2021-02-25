package jva_046.day_4.tv.realization.controller_buttons;

import jva_046.day_4.tv.realization.TV;

public class AbstractButton implements AbstrClick {

    private TV tv;
    private String name = "abstractButton";

    public AbstractButton(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    @Override
    public void click() {
        System.out.println("This is #AbstractButton realization");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
