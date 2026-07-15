interface WordCount{
    int count(String str);
}

public class Solution4{
    public static void main(String[] args){
        WordCount wc=str->{
            if(str.trim().isEmpty())
                return 0;
            return str.trim().split("\\s+").length;
        };

        String s="Java lambda expressions are easy";

        System.out.println("String: "+s);
        System.out.println("Word Count: "+wc.count(s));
    }
}