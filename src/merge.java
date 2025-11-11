import java.util.*;
class merger{
    public static int[] merge(int[]nums1, int[]nums2,int m,int n){
        int i=0;
        int j=0;
        int idx=0;
        int []res=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                res[idx]=nums1[i];
                i++;
                idx++;
            }
            else{
                res[idx]=nums2[j];
                j++;
                idx++;
            }
        }
        while(i<m){
            res[idx]=nums1[i];
            i++;
            idx++;
        }
        while(j<n){
            res[idx]=nums2[j];
            j++;
            idx++;
        }
        return res;
    }
}
public class merge {
    public static void main(String[] args) {
        int []nums1 = {1,2,3,0,0,0};
      int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        int []ans=merger.merge(nums1,nums2,m,n);
        for (int i=0;i<m+n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
