// variable sliding window : hire and fire
import java.util.*;
class minArray{
    public int sub(int [] nums,int target){
        int low=0;
        int high=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        while(high<nums.length){
            sum=sum+nums[high];
            while(sum>=target){
                int len=high-low+1;
              res=Math.min(len,res);
              sum=sum-nums[low];
              low++;

            }
            high++;
        }
        if(res==Integer.MAX_VALUE) return 0;
        return res;
    }
}
public class minsubarray {
    public static void main(String[] args) {
        minArray sc= new minArray();
        int []nums={1,4,4};
        int target=4;
        int res=sc.sub(nums,target);
        System.out.println(res);
    }
}
