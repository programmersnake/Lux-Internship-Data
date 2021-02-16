package JVA_045;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * 15.02.2021
 */
public class DAY_1 {

    public static void main(String[] args) {
        logger_and_IntLong();

        secondsInTheSomeWeeks();

        stringMethod();
    }

    private static void secondsInTheSomeWeeks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_____________Seconds in the some weeks______________________");

        final int DAYS_IN_WEEK = 7;
        final int HOURS_IN_DAY = 24;
        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_MINUTE = 60;
        int weeks;
        long seconds;
        System.out.print("weeks = ");
        weeks = scanner.nextInt();
        seconds = weeks * DAYS_IN_WEEK * HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;

        System.out.println("In " + weeks + " weeks is " + seconds + " (seconds).");
    }

    private static void logger_and_IntLong() {
        Logger logger = Logger.getLogger( "LoggerName" );
        logger.info( "Logger said first message." );
        System.out.println(30+"ghj");
        System.out.println("30/6 = " + 30/6);
        System.out.println("31%6 = " + 31%6);
        System.out.println("_____________________");
        System.out.println("Max_Int_value  = " + Integer.MAX_VALUE);
        System.out.println("Max_long_value = " + Long.MAX_VALUE);
        System.out.println();
        System.out.println("maxInteger + maxInteger = " + (Integer.MAX_VALUE+Integer.MAX_VALUE));
        System.out.println("maxLong + maxLong = " + (Long.MAX_VALUE+Long.MAX_VALUE));
        System.out.println();
        logger.info( "Logger said last message." + Integer.MAX_VALUE );
    }

    private static void stringMethod() {
        String str1 = "Denis";
        String str2 = "Denis";
        String str3 = new String("Denis");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
        System.out.println();
        System.out.println(str1.equals( str2 ));
        System.out.println(str1.equals( str3 ));
        System.out.println(str2.equals( str3 ));

    }

}
