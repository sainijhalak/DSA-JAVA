import java.util.*;
class sumSmaller{
    public static int sum(int []nums,int target){
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum>=target){
                    r--;
                }
                else{
                    count=count+(r-l);
                    l++;
                }
            }
        }
        return count;
    }
}
public class sumsmalller {
    public static void main(String[] args) {
        int []nums = {-2, 0, 1, 3};
        int target=2;
        int res= sumSmaller.sum(nums,target);
        System.out.println(res);
    }
}
