package codeForces;
import java.util.*;
public class onesixtyA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){

            sum=sum+arr[i];
        }
        Arrays.sort(arr);
        int c=0;
        int mysum=0;
        for(int i=n-1;i>=0;i--){
            if(sum<mysum) break;
            else{
                sum=sum-arr[i];
                mysum=mysum+arr[i];
                c++;
            }
        }
        System.out.println(c);
    }
}
