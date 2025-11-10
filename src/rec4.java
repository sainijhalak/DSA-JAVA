public class rec4 {
    public static void rev(int [] nums,int s,int e){
   if(s>=e){
       return;
   }
   int temp=nums[s];
   nums[s]=nums[e];
   nums[e]=temp;

   rev(nums,s+1,e-1);
    }

    public static void main(String[] args) {
        int [] nums={23,45,1,2,3};
        int s=0;
        int e=nums.length-1;
        rev(nums,s,e);
        for(int num:nums){
        System.out.println(num);
    }}

}
