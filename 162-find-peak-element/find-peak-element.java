class Solution {
    public int findPeakElement(int[] nums) {
        int x=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            x=Math.max(nums[i],x);
        }
        for(int j=0;j<nums.length;j++){
            if(x==nums[j])return j;
        }
        return 0;
    }
}