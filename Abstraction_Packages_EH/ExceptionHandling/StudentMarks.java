package Abstraction_Packages_EH.ExceptionHandling;



import java.util.Scanner;

class InvalidMarkException extends Exception {
    InvalidMarkException(String msg) {
        super(msg);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {
                System.out.print("Enter student name: ");
                String name = sc.next();

                int sum = 0;

                for (int j = 1; j <= 3; j++) {
                    System.out.print("Enter mark " + j + ": ");
                    int mark = Integer.parseInt(sc.next());

                    if (mark < 0 || mark > 100)
                        throw new InvalidMarkException("Marks should be between 0 and 100");

                    sum += mark;
                }

                System.out.println(name + " Average = " + (sum / 3.0));
            }

        } catch (NumberFormatException e) {
            System.out.println("Enter only integer marks.");
        } catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }
    }
}