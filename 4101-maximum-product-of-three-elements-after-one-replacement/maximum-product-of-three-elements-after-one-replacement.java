class Solution {
    public long maxProduct(int[] nums) {
         for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                 int temp=-1*nums[i];
                 nums[i]=temp;
            }
         }
         Arrays.sort(nums);
          long v=nums[nums.length-1];
          long x=nums[nums.length-2];


         return v*x*100000;
    }
}