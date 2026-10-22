class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,max=0,x=0;
        while(j<nums.length){
            if(nums[j]==0)x++;
            if(x<=k){
                max=Math.max(max,j-i+1);
            }
            else{
                while(x>k){
                    if(nums[i]==0)x--;
                    i++;
                }
            }
            j++;

        }
        return max;
    }
}