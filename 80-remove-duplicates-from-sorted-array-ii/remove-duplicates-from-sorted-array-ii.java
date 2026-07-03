class Solution {
    public int removeDuplicates(int[] nums) {
        int x=nums[0];
        int z=1;
        int t=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==x){
                if(z<2){
                nums[t]=nums[i];
                t++;
                }
                z++;
            }
            else{
               x = nums[i];
                z = 1;
                nums[t] = nums[i];
                t++;
            }
        }
        return t;
    }
}