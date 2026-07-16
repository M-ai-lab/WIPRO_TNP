import java.util.Scanner;

public class PalindromePossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int odd = 0;

        for (int i = 0; i < 256; i++) {
            if (count[i] % 2 != 0)
                odd++;
        }

        if (odd <= 1)
            System.out.println("Palindrome Possible");
        else
            System.out.println("Palindrome Not Possible");

        sc.close();
    }
}