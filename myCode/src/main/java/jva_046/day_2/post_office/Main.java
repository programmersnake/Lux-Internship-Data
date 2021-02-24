package jva_046.day_2.post_office;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();

        Person person1 = new Person();
        person1.setName( "Alex" );
        Person person2 = new Person();
        person2.setName( "Kate" );

        Letter letter1 = new Letter();
        letter1.setFromName( person1 );
        letter1.setToName( person2 );
        letter1.setText( "Hello my dear!" );

        postOffice.sentLetter( letter1 );

        Letter letter2 = new Letter();
        letter2.setFromName( person2 );
        letter2.setToName( person1 );
        letter2.setText( "I need some money and Iphone!" );

        postOffice.sentLetter( letter2 );

        Letter letter3 = new Letter();
        letter3.setFromName( person2 );
        letter3.setToName( person1 );
        letter3.setText( "Where is your answer?" );

        postOffice.sentLetter( letter3 );

        Letter letter4 = new Letter();
        letter4.setFromName( person1 );
        letter4.setToName( person2 );
        letter4.setText( "I will answer late" );

        postOffice.sentLetter( letter4 );

        Letter letter5 = new Letter();
        letter5.setFromName( person2 );
        letter5.setToName( person1 );
        letter5.setText( "Always busy of the bee..." );

        postOffice.sentLetter( letter5 );

        Letter newLetter = new Letter();
        newLetter.setText( "New" );
        newLetter.setToName( new Person( "Person1" ) );
        newLetter.setFromName( new Person( "Person2" ) );

        postOffice.sentLetter( newLetter );

        System.out.println();
        System.out.println( "___Final___Sent___" );
        System.out.println();

        ArrayList<Letter> lettersToP1 = postOffice.receiveLetterByGetter( person1 );
        ArrayList<Letter> lettersToP2 = postOffice.receiveLetterByGetter( person2 );

        int i = 1;
        for (Letter letter : lettersToP1) {
            System.out.println( "letter1Received {" + i + "/" + lettersToP1.size() + "}" );
            System.out.println( letter.toString() );
            i++;
        }
        System.out.println();
        i = 1;
        for (Letter letter : lettersToP2) {
            System.out.println( "letter1Received {" + i + "/" + lettersToP2.size() + "}" );
            System.out.println( letter.toString() );
            i++;
        }

        System.out.println();
        System.out.println("___Final___Get(receive)___");
        System.out.println();

        printHowMuchLettersSent( postOffice );
        System.out.println();
        printHowMuchLettersDelivered( postOffice );
        System.out.println( "---> All" );
        printLetterCopies( postOffice, "all", "" );
        System.out.println( "---> From " + person1.getName() );
        printLetterCopies( postOffice, "from", person1.getName() );

        System.out.println();
        System.out.println("___Final___");
        System.out.println();

    }

    public static void printHowMuchLettersSent(PostOffice postOffice) {
        System.out.println( "Need Delivered letters: " +
                postOffice.getSentLetters().size() +
                "; All sent Letters: " +
                (postOffice.getSentLetters().size() + postOffice.getDeliveredLetters().size()) );
    }

    public static void printHowMuchLettersDelivered(PostOffice postOffice) {
        System.out.println("Delivered letters: " + postOffice.getDeliveredLetters().size());
    }

    /**
     * @param postOffice
     *
     * @param filter
     * case "all" getAllLettersCopies
     * case "" equivalent "all"
     * case "from" getAllLettersCopiesFromName
     * case "to" getAllLettersCopiesToName
     *
     * @param name
     * if(filter.equals("all")) than not use
     *
     */
    public static void printLetterCopies(PostOffice postOffice, String filter, String name) {
        ArrayList<Letter> copiesLetters = new ArrayList<>();
        copiesLetters.addAll( postOffice.getDeliveredLetters() );
        copiesLetters.addAll( postOffice.getSentLetters() );

        ArrayList<Letter> tempLetterArrayList = new ArrayList<>();
        if(filter.toLowerCase().equals( "from" )) {
            for (Letter letter:copiesLetters) {
                if ( !letter.getFromName().getName().equals( name ) ) {
                    tempLetterArrayList.add( letter );
                }
            }
        }
        else if(filter.toLowerCase().equals( "to" )) {
            for (Letter letter:copiesLetters) {
                if ( !letter.getToName().getName().equals( name ) ) {
                    tempLetterArrayList.add( letter );
                }
            }
        }

        tempLetterArrayList.forEach( letter -> {
            copiesLetters.remove( letter );
        } );

        System.out.println("CopiesLetters: " + copiesLetters);

    }

}
