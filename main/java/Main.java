import com.sun.javaws.exceptions.ExitException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 18/09/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Création de la main 1
        System.out.print("Main 1 :    ");
        String str1 = sc.nextLine();

        List<Card> list1 = new ArrayList<Card>();
        String values1[] = str1.split(" ");
        if (values1.length != 5) {
            System.out.println("Une main doit être composée de 5 cartes");
            System.exit(0);
        }
        for (String i : values1) {
            Value value;
            Color color;
            //différencier le 10 du 1
            if (i.length() > 3) {
                value = Value.find(i.substring(0, 2));
                color = Color.find(i.substring(2));
            } else {
                value = Value.find(i.substring(0, 1));
                color = Color.find(i.substring(1));
            }
            System.out.println(color);

            Card card = new Card(value, color);
            list1.add(card);
        }
        Hand hand1 = new Hand(list1);


        //Création de la main 2
        System.out.print("\nMain 2 :    ");
        String str2 = sc.nextLine();

        List<Card> list2 = new ArrayList<Card>();
        String values2[] = str2.split(" ");
        for (String i : values2) {
            Value value;
            Color color;
            //différencier le 10 du 1
            if (i.length() > 3) {
                value = Value.find(i.substring(0, 2));
                color = Color.find(i.substring(2));
            } else {
                value = Value.find(i.substring(0, 1));
                color = Color.find(i.substring(1));
            }
            Card card = new Card(value, color);
            list2.add(card);
        }
        Hand hand2 = new Hand(list2);


        //Création du jeu
        Game game = new Game(hand1, hand2);
        game.findWinner();

        if (game.getWinner() == game.getHand1())
            System.out.println("La main 1 gagne avec carte la plus élevée :" + game.getHand1().findMax().getValue().getName());
        else if (game.getWinner() == game.getHand2())
            System.out.println("La main 2 gagne avec carte la plus élevée :" + game.getHand2().findMax().getValue().getName());
        else if (game.getWinner()== null)
            System.out.println("Egalité");
    }
}
