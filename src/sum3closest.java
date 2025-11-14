import java.util.*;
class sum1{
    public static int sum(int []nums,int target ){
        int closest=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){

            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                int diff=Math.abs(sum-target);
                if(diff<closest ){
                    closest=diff;
                }

                if(sum<target){
                   l++;
                } else if (sum>target) {
                    r--;
                }
                else{
                    return sum;
                }

            }
        }
        return closest;
    }
}

public class sum3closest {
    public static void main(String[] args) {
        int []nums = {-1,2,1,-4};
        int target=1;
        int res=sum1.sum(nums,target);
        System.out.println(res);
    }

}
