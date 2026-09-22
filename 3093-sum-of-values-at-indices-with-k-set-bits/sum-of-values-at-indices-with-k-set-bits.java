class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
      int sum=0;
      int x=0;
      for(int i:nums){
        int count=Integer.bitCount(x);

        if(count==k)sum+=i;
        x++;
      } 
      return sum; 
    }
}