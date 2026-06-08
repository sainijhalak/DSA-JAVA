package BootCamp;
import java.util.*;
public class Sort012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }
            else if(arr[j]==2){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                k--;
                j++;
            }
            else{
                j++;
            }
        }

        for(int m=0;m<n;m++){
            System.out.print(arr[m]);
        }
    }
}
