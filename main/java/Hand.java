import java.util.List;

/**
 * Created by user on 18/09/2017.
 */
public class Hand {

    List<Card> listCards;

    public Hand(List<Card> listCards) {
        this.listCards = listCards;
    }

    public Card findMax() {
        Card max = this.listCards.get(0);
        for (Card i : this.listCards) {
            if (i.getValue().ordinal() > max.getValue().ordinal())
                max = i;
        }
        return max;
    }
}
