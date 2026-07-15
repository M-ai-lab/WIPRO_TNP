@FunctionalInterface
interface DigitCount{
    int count(int n);
}

class MyDigits{
    public static int digitCount(int n){
        n=Math.abs(n);
        if(n==0)
            return 1;
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }
}

public class Solution2{
    public static void main(String[] args){
        DigitCount d=MyDigits::digitCount;

        System.out.println("Digits = "+d.count(123456));
    }
}