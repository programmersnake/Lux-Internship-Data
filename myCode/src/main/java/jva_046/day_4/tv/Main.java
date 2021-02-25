package jva_046.day_4.tv;

import jva_046.day_4.tv.realization.RemoteController;
import jva_046.day_4.tv.realization.TV;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV();
        RemoteController controller = new RemoteController(tv);
        controller.addDefaultButtonsToTheController();

        Scanner scanner = new Scanner( System.in );

        printHelpInfo();

        while( true ) {
            System.out.print("$ ");
            String inputString = scanner.nextLine().toLowerCase();

            if(inputString.equals( "q" ))
                break;
            else if(inputString.equals( "menu" ))
                controller.printAllDescriptionsAboutButtons();
            else if(inputString.equals( "help" ))
                printHelpInfo();
            else if(inputString.equals( "info" ))
                System.out.println(tv.getInfo());
            else
                channelListener( controller, inputString, tv );
        }
    }

    private static void channelListener(RemoteController controller, String inputString, TV tv) {
        try {
            Integer inputInteger = Integer.valueOf( inputString );
            controller.getButtons().get( inputInteger ).click();
            System.out.println(tv.getInfo());
        } catch(Exception ex) {}
    }

    private static void printHelpInfo() {
        System.out.println( "[menu -> for menu;   " +
                            "help -> for help;   " +
                            "info -> for get info about TV status;   " +
                            "q -> for end the program]" );
    }

}
