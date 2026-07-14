package Collection_Projects.CP1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Employees");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> employeeList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            Employee emp = new Employee(firstName, lastName, mobile, email, address);

            employeeList.add(emp);
        }

        Collections.sort(employeeList);

        System.out.println("\nEmployee List:");

        System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (Employee e : employeeList) {

            System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobile(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}