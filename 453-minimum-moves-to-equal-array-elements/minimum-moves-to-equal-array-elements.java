class Solution {
    public int minMoves(int[] nums) {
     Arrays.sort(nums);
    int x=nums[0];
    int h=0;
    for(int i=0;i<nums.length;i++){
        int t=nums[i]-x;
        h+=t;
    }
    return h;
    }
}