class Solution {
    public int findPeakElement(int[] nums) {
        int x=Integer.MIN_VALUE,u=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>x){
                x=nums[i];
                u=i;
            }
        }
        return u;
    }
}