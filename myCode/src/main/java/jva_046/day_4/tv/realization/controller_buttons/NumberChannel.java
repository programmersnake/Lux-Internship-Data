package jva_046.day_4.tv.realization.controller_buttons;

import jva_046.day_4.tv.realization.TV;

public class NumberChannel extends AbstractButton {

    private int numberChannel;

    public NumberChannel(TV tv, int numberChannel) {
        super(tv);
        this.numberChannel = numberChannel;
    }

    @Override
    public void click() {
        getTv().setChannel( numberChannel );
    }
}
