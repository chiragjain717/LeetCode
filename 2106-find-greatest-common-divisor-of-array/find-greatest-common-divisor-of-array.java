class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int x=nums[0];
        int v=nums[nums.length-1];
        int max=1;
        for(int i=1;i<=x;i++){
            if((x%i)==0&&(v%i)==0){
                max=i;
                }
         }
        return max;
    }
}