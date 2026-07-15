

import java.util.*;
import java.util.function.Predicate;

class Employee{
    private int id;
    private String name;
    private double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
}

public class Solution4{
    public static void main(String[] args){

        ArrayList<Employee> list=new ArrayList<>();

        list.add(new Employee(1,"Rahul",8000));
        list.add(new Employee(2,"Anu",12000));
        list.add(new Employee(3,"Kiran",9500));
        list.add(new Employee(4,"Neha",20000));
        list.add(new Employee(5,"Ravi",7000));

        Predicate<Employee> p=e->e.getSalary()<10000;

        list.stream()
                .filter(p)
                .forEach(e->System.out.println(e.getName()));
    }
}