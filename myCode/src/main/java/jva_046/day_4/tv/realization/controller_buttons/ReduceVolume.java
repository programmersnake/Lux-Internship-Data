package jva_046.day_4.tv.realization.controller_buttons;

import jva_046.day_4.tv.realization.TV;

public class ReduceVolume extends AbstractButton {

    public ReduceVolume(TV tv) {
        super(tv);
    }

    @Override
    public void click() {
        getTv().reduceVolume();
    }
}
