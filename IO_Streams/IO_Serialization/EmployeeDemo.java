package IO_Serialization;

//package IO_Operations;

import java.io.*;
import java.util.Date;

class Employee implements Serializable {

    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department,
                    String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Srividya",
                new Date(),
                "AI & ML",
                "Software Engineer",
                60000.0);

        // Serialization
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"));
            out.writeObject(emp);
            out.close();

            System.out.println("Employee object serialized successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }

        // Deserialization
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"));

            Employee e = (Employee) in.readObject();

            in.close();

            System.out.println("\nEmployee Details");
            System.out.println("Name        : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department  : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary      : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}