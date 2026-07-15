@FunctionalInterface
interface Factorial{
    int find(int n);
}

class MyFactorial{
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}

public class Solution1{
    public static void main(String[] args){
        MyFactorial obj=new MyFactorial();

        Factorial f=obj::factorial;

        System.out.println("Factorial = "+f.find(5));
    }
}