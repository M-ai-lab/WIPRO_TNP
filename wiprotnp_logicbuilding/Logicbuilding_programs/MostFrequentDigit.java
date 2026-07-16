import java.util.Scanner;

public class MostFrequentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        int[] freq = new int[10];

        for (int i = 0; i < num.length(); i++) {
            freq[num.charAt(i) - '0']++;
        }

        int max = 0;
        int digit = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }

        System.out.println("Most Frequent Digit = " + digit);

        sc.close();
    }
}