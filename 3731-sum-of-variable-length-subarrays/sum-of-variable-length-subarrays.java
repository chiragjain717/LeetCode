class Solution {
    public int subarraySum(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            int sum=Math.max(0,i-nums[i]);
                while(sum<=i){
                 x+=nums[sum];
                 sum++;
                }
        }
        return x;
    }
}