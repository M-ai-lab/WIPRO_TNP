import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {45,12,78,5,99,34,2};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}