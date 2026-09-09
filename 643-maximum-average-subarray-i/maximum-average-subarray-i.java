class Solution {
    public double findMaxAverage(int[] nums, int k) {
    //double max=Integer.MIN_VALUE;
    // int i=0,j=0,sum=0;
    // while(j<nums.length){
    //        if(j<k)sum+=nums[j];
    //        else{
    //         sum-=nums[i];
    //         sum+=nums[j];
    //         i++;
    //        }
    //        j++;
    //        max=Math.max(max,sum);
    // }
    // return max/k;
    int sum = 0; 
     for (int i = 0; i < k; i++) { 
        sum += nums[i]; } 
        int max = sum;  
        for (int j = k; j < nums.length; j++) {
             sum += nums[j]; sum -= nums[j - k]; 
             max = Math.max(max, sum); } 
             return (double) max / k;
    }
}