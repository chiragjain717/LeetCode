class Solution {
    public int longestOnes(int[] nums, int k) {
     int i=0,j=0,x=0,len=0;
     while(j<nums.length){
        if(nums[j]==0)x++;
        while(x>k){
            if(nums[i]==0)x--;
            i++;
        }
        len=Math.max(len,j-i+1);
        j++;

     }  
     return len; 
    }
}