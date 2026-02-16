package dsaArr;
import java.util.*;
public class TwoSum {
    public static int[] sum(int [] nums,int t){

        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sums=nums[i]+nums[j];
            if(sums==t) return new int[]{i+1,j+1};
            if(sums>t){
                j--;
            }
            if(sums<t){
                i++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int []nums={1,5,7,14,21};
        int t=35;
        int[] res= sum(nums,t);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
