package BootCamp;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        List<List <Integer>> res=new ArrayList<>();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                List<Integer> inner = new ArrayList<>();
                inner.add(i);
                inner.add(j);

                res.add(inner);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        for (int m= 0; m < res.size(); m++) {
            for (int k = 0; k< res.get(m).size(); k++) {
                System.out.print(res.get(m).get(k) + " ");
            }
            System.out.println();
        }
    }
}
