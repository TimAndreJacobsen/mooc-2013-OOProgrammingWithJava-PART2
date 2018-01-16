import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {


    /**
     * Method compare recieves call from Hand.sortAgainstSuit.
     *
     * Hand.sortAgainstSuit invokes Collections.sort(Object Card , Comparator SortAgainstSuit)
     * Cards are first checked for suit value in Int. If they are of equal value,
     *
     * return positive if card1 > card2
     * return negative if card1 < card2
     *
     * elseif + else can be changed with
     * else  {return card1.getSuit() - card2.getSuit(); }
     * Same functionality, less lines, less readable
     */

    @Override
    public int compare(Card card1, Card card2) {

        if (card1.getSuit() == card2.getSuit()) {
            return card1.getValue() - card2.getValue();
        } else if (card1.getSuit() > card2.getSuit()) {
            return 1;
        } else {
            return -1;
        }


    }


}
   