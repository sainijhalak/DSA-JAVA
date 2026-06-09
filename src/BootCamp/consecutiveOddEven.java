package BootCamp;
import java.util.*;
public class consecutiveOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=1;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i] % 2 != arr[i-1] % 2){
                count++;
            }

            else{

                max=Math.max(max,count);
                count=0;
            }
        }
        System.out.println(max);
    }
}
