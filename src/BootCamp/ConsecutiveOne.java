package BootCamp;
import java.util.*;
public class ConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{

                max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(max,count);
        System.out.print(max);
    }
}
