package BootCamp;

import java.util.Scanner;

public class MaxSumSubarraySW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        if(arr.length<k) System.out.println(0);
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        max=Math.max(max,sum);
        int low=0;
        int high=k;
        while(high<n){

            sum=sum-arr[low];
            sum=sum+arr[high];
            low++;
            high++;
            max=Math.max(sum,max);

        }
        System.out.println(max);
    }
}
