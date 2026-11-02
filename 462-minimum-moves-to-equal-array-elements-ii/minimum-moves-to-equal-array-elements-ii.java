class Solution {
    public int minMoves2(int[] nums) {
        int move=0;
        Arrays.sort(nums);
        int mid=nums.length/2;
        for(int i=0;i<nums.length;i++){
            move+=Math.abs(nums[i]-nums[mid]);

        }

         // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<nums[mid]){
        //         while(nums[i]<=nums[mid]){
        //             nums[i]+=1;
        //             move++;
        //         }
        //     }
        //     else{
        //         while(nums[i]>nums[mid]){
        //             nums[i]-=1;
        //             move++;
        //         }
        //     }
        // }
        return move;
    }
}