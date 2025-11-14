import java.util.*;
class sum2{
    public static List<List<Integer>> sum(int [] nums,int target){
        int i=0;
        List<List<Integer>> sum=new ArrayList<>();
        int j=nums.length-1;
        while(i<j){
            int sums=nums[i]+nums[j];
            if(sums==target){
                sum.add(Arrays.asList(nums[i],nums[j]));
                i++;
                j++;
                while(nums[i]==nums[i-1]){
                    i++;
                }

                while(nums[j]==nums[j+1]){
                    j--;
                }

            }
            else if(sums>target){
                j--;

            }
            else{
                i++;
            }
        }
        return sum;

}

}
public class twosumwithdup {
    public static void main(String[] args) {
        int []nums={2,2,4,5,7,7,11,15};
        int target =9;
        List<List <Integer>> res=sum2.sum(nums,target);
        for (int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
