class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0,pro=1,x=0;
        while(j<nums.length){
        pro*=nums[j];
        while(pro>=k&&i<=j){
             pro/=nums[i];
            i++;
        }
          x+=j-i+1;
           j++;
        }
        return x;
    }
}