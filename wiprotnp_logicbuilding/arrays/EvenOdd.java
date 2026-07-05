public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,1};

        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2!=0) {
                for(int j=i+1;j<arr.length;j++) {
                    if(arr[j]%2==0) {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}