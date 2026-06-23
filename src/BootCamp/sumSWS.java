package BootCamp;

import java.util.Scanner;

public class sumSWS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int S=sc.nextInt();
        int low=0;
        int high=0;
        int sum=0;
        while(high<n){
            sum=sum+arr[high];
            if(sum==S) max=Math.max(max,high-low+1);
            while(sum>S){
                sum=sum-arr[low];
                low++;
                if(sum==S) max=Math.max(max,high-low+1);

            }
            high++;
        }
        System.out.println(max);
    }
}
