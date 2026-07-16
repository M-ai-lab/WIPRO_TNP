import java.util.Scanner;

public class CreatePIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alpha = sc.nextInt();
        int beta = sc.nextInt();
        int gamma = sc.nextInt();

        int pin = alpha + beta + gamma;

        System.out.println("PIN = " + pin);

        sc.close();
    }
}