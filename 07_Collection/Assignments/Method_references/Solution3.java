@FunctionalInterface
interface Prime{
    CheckPrime check(int n);
}

class CheckPrime{
    CheckPrime(int n){
        if(isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}

public class Solution3{
    public static void main(String[] args){
        Prime p=CheckPrime::new;

        p.check(17);
    }
}