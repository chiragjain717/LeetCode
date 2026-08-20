class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int x=Integer.MAX_VALUE;
        int y=Integer.MIN_VALUE;
        for(int i:nums){
            x=Math.min(x,i);
            y=Math.max(y,i);
        
        }
        return (long)(y-x)*k;
    }
}