package jva_045;

import java.util.Arrays;

/**
 * 17.02.2021
 */
public class DAY_3 {

    public static void main(String[] args) {
        String str = "Denis";
        String [] strArray = new String[] {"Denis", "Lena"};

        System.out.println("Start str = " + str);
        update(str);
        System.out.println("Main str = " + str);
        System.out.println();
        System.out.println("Start Array = " + Arrays.toString( strArray ));
        update(strArray);
        System.out.println("Main Array = " + Arrays.toString(strArray));
    }

    private static void update(String[] strArray) {
        strArray[0] = "Sasha";
        System.out.println("Update Array = " + Arrays.toString( strArray ));
    }

    private static void update(String str) {
        str = "Sasha";
        System.out.println("Update Str = " + str);
    }

}
