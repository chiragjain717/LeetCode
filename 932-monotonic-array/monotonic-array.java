class Solution {
    public boolean isMonotonic(int[] nums) {
        // int x=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]>=x){
        //         x=nums[i];
        //     }else{
        //         return false;
        //     }
        // }
        // return true;
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) increasing = false;
            if(nums[i] < nums[i+1]) decreasing = false;
        }

        return increasing || decreasing;
    }
}