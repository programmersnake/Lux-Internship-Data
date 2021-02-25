package jva_046.day_4.tv.realization.controller_buttons.command_button;

import jva_046.day_4.tv.realization.TV;
import jva_046.day_4.tv.realization.controller_buttons.AbstrClick;
import jva_046.day_4.tv.realization.controller_buttons.AbstractButton;

public class YellowCommandButton extends AbstractButton implements AbstrClick {

    public YellowCommandButton(TV tv) {
        super( tv );
    }

    @Override
    public void click() {
        getTv().yellowButtonAction();
    }
}
