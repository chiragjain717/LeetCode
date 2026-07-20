class Solution {
    public int smallestRangeI(int[] nums, int k) {
         int x = nums[0];
        int y= nums[0];

        for(int i = 1; i < nums.length; i++){
            x = Math.min(x, nums[i]);
            y = Math.max(y, nums[i]);
        }

        return Math.max(0, y-x - 2*k);
    }
}