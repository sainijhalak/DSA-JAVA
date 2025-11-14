import java.util.*;
class sq{
    public static int[] square(int []nums){
        int i=0;
        int j=nums.length-1;
        int p=nums.length-1;
        int []res=new int[j+1];
        while (i <= j) {
            int l=nums[i]*nums[i];
            int r=nums[j]*nums[j];
            if(l>r){
                res[p]=l;
                p--;
                i++;
            }
            else{
                res[p--]=r;
                j--;
            }

        }
        return res;
    }

}
public class Squareofarr {
    public static void main(String[] args) {
        int []nums = {-4,-1,0,3,10};
        int [] ans=sq.square(nums);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
