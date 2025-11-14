import java.util.*;
class sunArray{
    public static int sub(int []nums,int k){
        int low=0;
        int high=k-1;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<k;i++){
           sum =sum+nums[i];
        }
        while(high<nums.length){
            max=Math.max(sum,max);
            low++;
            high++;
            sum=sum-nums[low-1];
            if (high==nums.length)  break;
            sum=sum+nums[high];
        }
        return max;
    }
}
public class maxsubarray {
    public static void main(String[] args) {
        int []nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        int r=sunArray.sub(nums,k);
        System.out.println(r);
    }
}
