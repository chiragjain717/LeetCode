class Solution {
    public int[] leftRightDifference(int[] nums) {
        int x[]=new int[nums.length];
        x[0]=0;
        int y[]=new int[nums.length];
        y[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
            x[i]=x[i-1]+nums[i-1];
             }
             int t=nums.length-1;
             for(int i=nums.length-2;i>=0;i--){
                y[i]=y[i+1]+nums[t];
                t--;

             }
             int z[]=new int[nums.length];
             for(int i=0;i<z.length;i++){
                z[i]=Math.abs(x[i]-y[i]);
             }
             return z;
    }
}