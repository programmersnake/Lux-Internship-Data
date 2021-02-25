package jva_046.day_4.tv.realization.controller_buttons.command_button;

import jva_046.day_4.tv.realization.TV;
import jva_046.day_4.tv.realization.controller_buttons.AbstrClick;
import jva_046.day_4.tv.realization.controller_buttons.AbstractButton;

public class RedCommandButton extends AbstractButton implements AbstrClick {

    public RedCommandButton(TV tv) {
        super( tv );
    }

    @Override
    public void click() {
        getTv().redButtonAction();
    }
}
