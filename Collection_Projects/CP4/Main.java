package Collection_Projects.CP4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, ArrayList<Card>> map = new HashMap<>();

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");

            String symbol = sc.next();
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            if (!map.containsKey(symbol)) {
                map.put(symbol, new ArrayList<Card>());
            }

            map.get(symbol).add(card);
        }

        TreeSet<String> symbols = new TreeSet<>(map.keySet());

        System.out.println("Distinct Symbols are :");

        for (String s : symbols) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : symbols) {

            System.out.println("Cards in " + s + " Symbol");

            ArrayList<Card> list = map.get(s);

            int sum = 0;

            for (Card c : list) {
                System.out.println(c.getSymbol() + " " + c.getNumber());
                sum += c.getNumber();
            }

            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}