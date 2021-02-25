package jva_046.day_2.post_office;

import java.util.ArrayList;

public class PostOffice {

    private ArrayList<Letter> sentLetters = new ArrayList<>();
    private ArrayList<Letter> deliveredLetters = new ArrayList<>();

    public void sentLetter(Letter letter) {
        sentLetters.add( letter );
    }

    public ArrayList<Letter> getSentLetters() {
        return sentLetters;
    }

    public ArrayList<Letter> getDeliveredLetters() {
        return deliveredLetters;
    }

    public ArrayList<Letter> receiveAllSentLetters() {
        deliveredLetters.addAll( sentLetters );
        ArrayList<Letter> tempLettersList = new ArrayList<>();
        tempLettersList.addAll( sentLetters );
        sentLetters.clear();
        return tempLettersList;
    }

    public ArrayList<Letter> receiveLetterBySender(Person fromThisPerson) {
        ArrayList<Letter> tempLettersList = new ArrayList<>();
        for (Letter letter : sentLetters) {
            if ( letter.getFromName().equals( fromThisPerson ) ) {
                tempLettersList.add( letter );
                deliveredLetters.add( letter );
            }
        }

        tempLettersList.forEach( letter -> {
            sentLetters.remove( letter );
        } );
        return tempLettersList;
    }

    public ArrayList<Letter> receiveLetterByGetter(Person toThisPerson) {
        ArrayList<Letter> tempLettersList = new ArrayList<>();
        for (Letter letter:sentLetters) {
            if ( letter.getToName().equals( toThisPerson ) ) {
                tempLettersList.add( letter );
                deliveredLetters.add( letter );
            }
        }

        tempLettersList.forEach( letter -> {
            sentLetters.remove( letter );
        } );

        return tempLettersList;
    }

    public void printHowMuchLettersSent() {
        System.out.println( "Need Delivered letters: " +
                getSentLetters().size() +
                "; All sent Letters: " +
                (getSentLetters().size() + getDeliveredLetters().size()) );
    }

    public void printHowMuchLettersDelivered() {
        System.out.println("Delivered letters: " + getDeliveredLetters().size());
    }

    /**
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
    public void printLetterCopies(String filter, String name) {
        ArrayList<Letter> copiesLetters = new ArrayList<>();
        copiesLetters.addAll( getDeliveredLetters() );
        copiesLetters.addAll( getSentLetters() );

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
