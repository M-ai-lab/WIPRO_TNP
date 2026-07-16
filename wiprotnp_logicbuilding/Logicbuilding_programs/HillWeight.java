import java.util.Scanner;

public class HillWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println();
        }

        System.out.println("Weight = " + sum);

        sc.close();
    }
}