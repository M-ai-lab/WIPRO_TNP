package outside;
import test.Foundation;

public class TestFoundation{
    public static void main(String[] args){
        Foundation f=new Foundation();

        //System.out.println(f.var1); // Private - Not Accessible
        //System.out.println(f.var2); // Default - Not Accessible
        //System.out.println(f.var3); // Protected - Not Accessible
        System.out.println(f.var4);   // Public - Accessible
    }
}