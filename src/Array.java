import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr =new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
//        for (int i=0;i<n;i++){
//
//            System.out.println(arr[i]);
//        }
        int smallest = arr[0];
        int largest = arr[0];

        for (int i=0;i<n;i++){
if(arr[i]<smallest){
    smallest=arr[i];
}
            if(arr[i]>smallest){
                largest=arr[i];
            }

        }
        int span =largest-smallest;
        System.out.println(span);


    }
}
