class Solution {
    public int rob(int[] nums) {
        int x=0,y=0;
        for(int i:nums){
            int m=Math.max(x,y+i);
              y=x;
        x=m;
        }
        return x;
       
    }
    
}