package codeForces;
import java.util.*;
public class threesixtythreeB {

        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int low=0;
            int high=k-1;
            int sum=0;
            int idx=0;
            for(int i=0;i<k;i++){
                sum=sum+arr[i];
            }
            while(high<n){
                int prev=sum;
                high++;
                if(high==n) break;
                sum=sum-arr[low]+arr[high];
                low++;
                if(sum<prev){
                    idx=low;
                }
   }
            System.out.print(idx+1);
        }
    }

