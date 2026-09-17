class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double u=Integer.MAX_VALUE;
        int i=0,j=nums.length-1;
        while(i<j){
            double x=nums[i]+nums[j];
            u=Math.min(u,x/2);
            i++;
            j--;


        }
        return u;
    }
}