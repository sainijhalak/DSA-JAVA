package BootCamp;
import java.util.*;
public class TwosumUnsortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int ans=target-arr[i];
            if(map.containsKey(ans)){
                System.out.println(map.get(ans)+""+i);
                break;
            }

            else{
                map.put(arr[i],i);

            }
        }
    }
}
