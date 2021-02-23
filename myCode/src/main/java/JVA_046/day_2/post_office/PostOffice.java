package JVA_046.day_2.post_office;

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
        for (Letter letter:sentLetters) {
            if(letter.getFromName().equals( fromThisPerson.getName() )) {
                tempLettersList.add( letter );
                deliveredLetters.add( letter );
                sentLetters.remove( letter );
            }
        }
        return tempLettersList;
    }

    public ArrayList<Letter> receiveLetterByGetter(Person toThisPerson) {
        ArrayList<Letter> tempLettersList = new ArrayList<>();
        for (Letter letter:sentLetters) {
            if(letter.getToName().equals( toThisPerson.getName() )) {
                tempLettersList.add( letter );
                deliveredLetters.add( letter );
            }
        }

        tempLettersList.forEach( letter -> {
            sentLetters.remove( letter );
        } );

        return tempLettersList;
    }

}
