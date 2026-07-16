import java.util.Scanner;

public class WeightOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();

        int weight = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                weight += str.charAt(i) - 'A' + 1;
            }
        }

        System.out.println(weight);

        sc.close();
    }
}