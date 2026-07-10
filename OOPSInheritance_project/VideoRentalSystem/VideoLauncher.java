package OOPSInheritance_project.VideoRentalSystem;
import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice;

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("1.Add Videos:");
            System.out.println("2.Check Out Video :");
            System.out.println("3.Return Video :");
            System.out.println("4.Receive Rating :");
            System.out.println("5.List Inventory :");
            System.out.println("6.Exit :");

            System.out.print("Enter your choice (1..6): ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter the name of the video you want to add: ");
                String name = sc.nextLine();
                store.addVideo(name);
            } else if (choice == 2) {
                System.out.print("Enter the name of the video you want to check out: ");
                String name = sc.nextLine();
                store.doCheckout(name);
            } else if (choice == 3) {
                System.out.print("Enter the name of the video you want to Return: ");
                String name = sc.nextLine();
                store.doReturn(name);
            } else if (choice == 4) {
                System.out.print("Enter the name of the video you want to Rate: ");
                String name = sc.nextLine();

                System.out.print("Enter the rating for this video: ");
                int rating = sc.nextInt();
                sc.nextLine();

                store.receiveRating(name, rating);
            } else if (choice == 5) {
                store.listInventory();
            } else if (choice == 6) {
                System.out.println("Exiting...!! Thanks for using the application.");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}