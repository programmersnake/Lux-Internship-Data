package jva_046.day_4.tv.realization.controller_buttons;

import jva_046.day_4.tv.realization.TV;

public class BackChannel extends AbstractButton {

    public BackChannel(TV tv) {
        super(tv);
    }

    @Override
    public void click() {
        getTv().backChannel();
    }
}
