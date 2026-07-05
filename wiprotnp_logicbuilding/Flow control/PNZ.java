class PNZ{
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        if (n>0)
            System.out.println(n + " is Positive");
        else if(n<0)
            System.out.println(n + " is Negative");
        else
            System.out.println(n + " is Zero");
    }
}