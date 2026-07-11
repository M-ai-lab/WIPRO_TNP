package Abstraction_Packages_EH.ExceptionHandling;
public class Mathoperation {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                System.out.println("Please enter exactly 5 integers.");
                return;
            }

            int[] arr = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }

            double avg = (double) sum / 5;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);

        } catch (NumberFormatException e) {
            System.out.println("Only integers are allowed.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}