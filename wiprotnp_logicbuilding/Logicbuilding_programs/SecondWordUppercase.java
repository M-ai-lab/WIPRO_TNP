import java.util.Scanner;

public class SecondWordUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        if (words.length >= 2)
            System.out.println(words[1].toUpperCase());
        else
            System.out.println("No Second Word");

        sc.close();
    }
}