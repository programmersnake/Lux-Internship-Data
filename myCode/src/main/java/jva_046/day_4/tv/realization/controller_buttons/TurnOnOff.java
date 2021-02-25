package jva_046.day_4.tv.realization.controller_buttons;

import jva_046.day_4.tv.realization.TV;

public class TurnOnOff extends AbstractButton {

    public TurnOnOff(TV tv) {
        super(tv);
    }

    @Override
    public void click() {
        getTv().setOnOff(  );
    }
}
