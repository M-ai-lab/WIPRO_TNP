package Wrapper_classes;

import java.util.Scanner;
class EmployeeClass implements Cloneable {
    private String name;
    private int age;

    public EmployeeClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Solution4 {
    public static void main(String[] args) {
        EmployeeClass emp1 = new EmployeeClass("John", 30);

        EmployeeClass emp2 = null;
        try {
            emp2 = (EmployeeClass) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Original Employee: " + emp1);
        System.out.println("Clone Employee: " + emp2);

        emp1.setName("Alice");
        emp1.setAge(25);
        emp2.setName("Bob");
        emp2.setAge(35);

        System.out.println("Modified Original Employee: " + emp1);
        System.out.println("Modified Clone Employee: " + emp2);
    }
}
