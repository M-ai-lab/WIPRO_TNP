//package 07_Collection.Lambda;

import java.util.ArrayList;
import java.util.Random;

public class Solution1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        Random r = new Random();

        for(int i=0;i<25;i++){
            a1.add(r.nextInt(100)+1);
        }

        System.out.println("Numbers:");
        a1.forEach(n->System.out.print(n+" "));

        System.out.println("\nPrime Numbers:");
        a1.stream()
          .filter(Solution1::isPrime)
          .forEach(n->System.out.print(n+" "));
    }

    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
