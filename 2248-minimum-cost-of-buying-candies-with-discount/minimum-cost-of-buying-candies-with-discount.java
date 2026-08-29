class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int x=0,sum=0;
        for(int i=cost.length-1;i>=0;i--){
            x++;
            if(x%3==0)continue;
            else{
                sum+=cost[i];
            }
        }
        return sum;
    }
}