import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card c : hand) {
            String cardValue ="";
            if (c.getValue() == 11) {
                cardValue = "J";
            } else if (c.getValue() == 12) {
                cardValue = "Q";
            } else if (c.getValue() == 13) {
                cardValue = "K";
            } else if (c.getValue() == 14) {
                cardValue = "A";
            } else {
                cardValue += c.getValue();
            }
            System.out.println(cardValue + " of " + c.getSuitToString());
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }


    @Override
    public int compareTo(Hand compared) {
        int handValue = 0;
        int comparedHandValue = 0;

        for (Card card : this.hand) {
            handValue += card.getValue();
        }
        for (Card card : compared.hand) {
            comparedHandValue += card.getValue();
        }

        if (handValue > comparedHandValue) {
            return 1;

        } else if (comparedHandValue > handValue) {
            return -1;

        } return 0;
    }
}
