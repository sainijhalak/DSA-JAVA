import java.util.*;
class rem{
    public static int remDup(int []nums){
        int i=0;
        int n = nums.length;
        int j=1;
       while(j<n){
           if(nums[j]==nums[j-1]){
               j++;
               continue;

           }
           nums[i+1]=nums[j];
           i++;
           j++;

       }
       return i+1;

    }

}

public class duplicateremove {
    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,2,2,3,3,4};
        int s= rem.remDup(nums);
        System.out.println(s);
    }
}
