import java.util.ArrayList;

class Student{
    int rollNo;
    String name;
    int mark;

    Student(int rollNo,String name,int mark){
        this.rollNo=rollNo;
        this.name=name;
        this.mark=mark;
    }

    public String toString(){
        return rollNo+" "+name+" "+mark;
    }
}

public class Solution3{
    public static void main(String[] args){

        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student(1,"Rahul",78));
        list.add(new Student(2,"Anu",45));
        list.add(new Student(3,"Kiran",88));
        list.add(new Student(4,"Neha",50));
        list.add(new Student(5,"Ravi",39));

        long count=list.stream()
                .filter(s->s.mark>=50)
                .count();

        System.out.println("Students Passed:");

        list.stream()
                .filter(s->s.mark>=50)
                .forEach(System.out::println);

        System.out.println("Count = "+count);
    }
}