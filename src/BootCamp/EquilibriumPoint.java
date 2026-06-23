package BootCamp;

import java.util.Scanner;
import java.util.*;
public class EquilibriumPoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
     int i=0;
        int j=arr.length-1;
        int sum1=arr[0];
        int sum2=arr[arr.length-1];
        while(i<j){
            if(sum1==sum2) {
                System.out.println(i+1);
                break;
            }
            if(sum1>sum2){
                j--;
                sum2=sum2+arr[j];
            }
            else{
                i++;
                sum1=sum1+arr[i];
            }

        }

    }
}
