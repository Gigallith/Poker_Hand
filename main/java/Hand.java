import java.util.List;

/**
 * Created by user on 18/09/2017.
 */
public class Hand {

    List<Card> hand;

    public Hand(List<Card> hand) {
        this.hand = hand;
    }

    public Card findMax() {
        Card max = this.hand.get(1);
        for (Card i : this.hand) {
            if (i.getValue().ordinal() > max.getValue().ordinal())
                max = i;
        }
        return max;
    }
}
