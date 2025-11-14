import java.util.*;
class dutch{
    public static int [] d(int []nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if (nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;

            } else if (nums[mid]==2) {
                int temp=nums[high];
                nums[high]=nums[mid];
                        nums[mid]=temp;
                high--;

            }
            else {
                mid++;
            }
        }
        return nums;
    }
}
public class DutchNationalFlag {
    public static void main(String[] args) {
        int []nums = {2,0,2,1,1,0};
        int []res=dutch.d(nums);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
