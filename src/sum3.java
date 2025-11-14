import java.util.*;
class threesum{
    public static  List<List<Integer>> sums(int []nums){
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> sum3 =new ArrayList<>();
for(int i=0;i<n-2;i++){
    if (i>0 && nums[i]==nums[i-1]) continue;
    int l=i+1;
    int r=n-1;
    int s=(-1)*nums[i];
    while(l<r){
        int sum=nums[l]+nums[r];
        if(sum==s){
            sum3.add(Arrays.asList(nums[i],nums[l],nums[r]));
            l++;
            r-- ;
            while(l<r && nums[l] ==nums[l-1]){
    l++;
}
            while(l<r && nums[r] == nums[r+1]){
                r--;
            }
        }
        else if(sum<s){
            l++;
        }
        else{
            r--;
        }

    }
}
return sum3;
    }
}
public class sum3 {
    public static void main(String[] args) {
        int []nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res=threesum.sums(nums);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }
}
