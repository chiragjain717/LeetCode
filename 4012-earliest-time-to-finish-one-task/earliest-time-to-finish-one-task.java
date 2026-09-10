class Solution {
    public int earliestTime(int[][] tasks) {
        int n= tasks.length;
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int a=tasks[i][0];
            int b=tasks[i][1];
             int z=a+b;

             sum=Math.min(sum,z);
        }
        return sum;
    }
}