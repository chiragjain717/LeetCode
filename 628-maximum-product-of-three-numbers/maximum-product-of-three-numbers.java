class Solution {
    public int maximumProduct(int[] nums) {
    //     int sum=1,x=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]<0)x++;
    //         sum*=nums[i];
    //     }
    //   if(x==nums.length)return sum;
    //   for(int i=0;i<nums.length;i++){
    //     if(nums[i]<0){
    //         int tem=nums[i]*-1;
    //         nums[i]=tem;

    //     }
    //   }
    //  Arrays.sort(nums);
    //  int n=nums.length;

    //  return nums[n-1]*nums[n-2]*nums[n-3];
    Arrays.sort(nums);
        int n = nums.length;
        
        int x= nums[n-1] * nums[n-2] * nums[n-3];
        int y = nums[0] * nums[1] * nums[n-1];
        
        return Math.max(x, y);

    }
}
