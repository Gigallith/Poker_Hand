/**
 * Created by user on 18/09/2017.
 */
public class Game {

    private Hand hand1;
    private Hand hand2;

    private Hand winner;

    public Game(Hand hand1, Hand hand2) {
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    private Hand higherCard() {
        int score1 = this.hand1.findMax().getValue().ordinal();
        //System.out.println(score1);
        int score2 = this.hand2.findMax().getValue().ordinal();
        //System.out.println(score2);
        if (score1 > score2)
            return hand1;
        else if (score1 < score2)
            return hand2;
        else
            return null;
    }

    public void findWinner() {
        if (higherCard() != null) {
            this.winner = higherCard();
        }
    }


    public Hand getHand1() {
        return hand1;
    }

    public Hand getHand2() {
        return hand2;
    }

    public Hand getWinner() {
        return winner;
    }

}
