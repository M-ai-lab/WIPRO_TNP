package Collection_Projects.CP3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Card> cards = new HashMap<>();
        TreeSet<String> symbols = new TreeSet<>();

        int count = 0;

        while (symbols.size() < 4) {

            System.out.println("Enter a card :");
            String symbol = sc.next();

            int number = sc.nextInt();

            count++;

            if (!cards.containsKey(symbol)) {
                cards.put(symbol, new Card(symbol, number));
                symbols.add(symbol);
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are :");

        for (String s : symbols) {
            Card c = cards.get(s);
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}