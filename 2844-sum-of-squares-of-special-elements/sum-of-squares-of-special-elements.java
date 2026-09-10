class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        System.out.println(sum);
        int u=1;
        for(int i=0;i<nums.length;i++){
            if(nums.length%u==0){
                sum+=nums[i]*nums[i];
            
        }
        u++;
        }
        return sum;
    }
}