import java.util.*;
class twosumpart2 {
    public int[] two(int[] nums, int target) {
        int i = 0;
        int n = nums.length;
        int j = n - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }
            if (sum > target) {
                j--;
            }
            if(sum<target){
                i++;
            }
        }
        return new int[]{};
        }

    }

public class TwoSum2 {
    public static void main(String[] args) {
        int []nums={2,7,11,15};
        int target=9;
        twosumpart2 sc =new twosumpart2();
        int []ans=sc.two(nums,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }

}
