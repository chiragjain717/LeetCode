class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,x=0,len=0;
        while(j<nums.length){
            if(nums[j]==0)x++;
            while(x>1){
                if(nums[i]==0)x--;
                i++;
            }
            len=Math.max(j-i,len);
            j++;

        }
        return len;
    }
}