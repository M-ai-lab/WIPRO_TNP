import java.util.Scanner;

public class floydwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Please enter an integer number");
        } else {
            int n = sc.nextInt();
            int i = 1;

            while (i <= n) {
                int j = 1;

                while (j <= i) {
                    System.out.print("* ");
                    j++;
                }

                System.out.println();
                i++;
            }
        }

        sc.close();
    }
}