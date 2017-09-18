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
        for (String i : values1) {
            Value value;
            Color color;
            //différencier le 10 du 1
            if (i.length() > 3){
                value = Value.find(i.substring(0,2));
                color = Color.find(i.substring(2));
            } else {
                value = Value.find(i.substring(0,1));
                color = Color.find(i.substring(1));
            }
            Card card = new Card(value,color);
            list1.add(card);
        }



        //Création de la main 2
        System.out.print("\nMain 2 :    ");
        String str2 = sc.nextLine();

        Game game = new Game();
    }
}
