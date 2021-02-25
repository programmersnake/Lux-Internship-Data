package jva_046.day_4.tv.realization;

import jva_046.day_4.tv.realization.controller_buttons.*;
import jva_046.day_4.tv.realization.controller_buttons.command_button.BlueCommandButton;
import jva_046.day_4.tv.realization.controller_buttons.command_button.GreenCommandButton;
import jva_046.day_4.tv.realization.controller_buttons.command_button.RedCommandButton;
import jva_046.day_4.tv.realization.controller_buttons.command_button.YellowCommandButton;

import java.util.ArrayList;

public class RemoteController {

    private TV tv;

    private ArrayList<AbstractButton> buttons = new ArrayList<>();

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public void printAllDescriptionsAboutButtons() {
        System.out.println("");
        System.out.println("-----------COMMANDS-----------");
        for(int i = 0; i<buttons.size(); i++) {
            System.out.println(i + ") " + buttons.get( i ).getName());
        }
        System.out.println();
    }

    public void addDefaultButtonsToTheController() {
        AbstractButton turnOnOff = new TurnOnOff( tv );
        turnOnOff.setName( "TurnOnOff" );

        AbstractButton nextChannel = new NextChannel( tv );
        nextChannel.setName( "NextChannel" );
        AbstractButton backChannel = new BackChannel( tv );
        backChannel.setName( "BackChannel" );
        AbstractButton increaseVolume = new IncreaseVolume( tv );
        increaseVolume.setName( "IncreaseVolume" );
        AbstractButton reduceVolume = new ReduceVolume( tv );
        reduceVolume.setName( "ReduceVolume" );

        AbstractButton numberChannel0 = new NumberChannel( tv, 0 );
        numberChannel0.setName( "NumberChannel0" );
        AbstractButton numberChannel1 = new NumberChannel( tv, 1 );
        numberChannel1.setName( "NumberChannel1" );
        AbstractButton numberChannel2 = new NumberChannel( tv, 2 );
        numberChannel2.setName( "NumberChannel2" );
        AbstractButton numberChannel3 = new NumberChannel( tv, 3 );
        numberChannel3.setName( "NumberChannel3" );
        AbstractButton numberChannel4 = new NumberChannel( tv, 4 );
        numberChannel4.setName( "NumberChannel4" );
        AbstractButton numberChannel5 = new NumberChannel( tv, 5 );
        numberChannel5.setName( "NumberChannel5" );
        AbstractButton numberChannel6 = new NumberChannel( tv, 6 );
        numberChannel6.setName( "NumberChannel6" );
        AbstractButton numberChannel7 = new NumberChannel( tv, 7 );
        numberChannel7.setName( "NumberChannel7" );
        AbstractButton numberChannel8 = new NumberChannel( tv, 8 );
        numberChannel8.setName( "NumberChannel8" );
        AbstractButton numberChannel9 = new NumberChannel( tv, 9 );
        numberChannel9.setName( "NumberChannel9" );

        AbstractButton redCommandButton = new RedCommandButton( tv );
        redCommandButton.setName( "RedCommandButton" );
        AbstractButton yellowCommandButton = new YellowCommandButton( tv );
        yellowCommandButton.setName( "YellowCommandButton" );
        AbstractButton greenCommandButton = new GreenCommandButton( tv );
        greenCommandButton.setName( "GreenCommandButton" );
        AbstractButton blueCommandButton = new BlueCommandButton( tv );
        blueCommandButton.setName( "BlueCommandButton" );

        ArrayList<AbstractButton> defaultButtons = new ArrayList<>();
        defaultButtons.add( turnOnOff );
        defaultButtons.add( nextChannel );
        defaultButtons.add( backChannel );
        defaultButtons.add( increaseVolume );
        defaultButtons.add( reduceVolume );
        defaultButtons.add( numberChannel0 );
        defaultButtons.add( numberChannel1 );
        defaultButtons.add( numberChannel2 );
        defaultButtons.add( numberChannel3 );
        defaultButtons.add( numberChannel4 );
        defaultButtons.add( numberChannel5 );
        defaultButtons.add( numberChannel6 );
        defaultButtons.add( numberChannel7 );
        defaultButtons.add( numberChannel8 );
        defaultButtons.add( numberChannel9 );
        defaultButtons.add( redCommandButton );
        defaultButtons.add( yellowCommandButton );
        defaultButtons.add( greenCommandButton );
        defaultButtons.add( blueCommandButton );

        setButtons( defaultButtons );

    }

    public void addButton(AbstractButton newButton) {
        buttons.add( newButton );
    }

    public void removeButton(AbstractButton button) {
        if( buttons.contains( button ) )
            buttons.remove( button );
    }

    public ArrayList<AbstractButton> getButtons() {
        return buttons;
    }

    public void setButtons(ArrayList<AbstractButton> buttons) {
        this.buttons = buttons;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
