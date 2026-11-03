class Solution {
    public int minMoves(int[] nums) {
        int m=0;
        for(int i:nums){
            m=Math.max(m,i);
        }
        int sum=0;
        for(int i:nums){
            sum+=m-i;
        }
        return sum;
    }
}