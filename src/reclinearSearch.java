
import java.util.*;
public class reclinearSearch {
    static int linear(int[]nums,int i,int x){
if(i==nums.length) return -1;
if(nums[i]==x){ return i+1;}
   return linear(nums,i+1,x);

    }

    public static void main(String[] args) {
        int[]nums={18,21,32,42,24};
        int x=32;
        int i=0;
        int res=linear(nums,i,x);
        System.out.println(res);
    }

}
