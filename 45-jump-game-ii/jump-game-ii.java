class Solution {
    public int jump(int[] nums) {
     int max=0;
     int curr=0,f=0;
    for(int i=0;i<nums.length-1;i++){
        max=Math.max(max,i+nums[i]);
        if(i==curr){
            f++;
            curr=max;
        }

    }
    return f;
    }
}