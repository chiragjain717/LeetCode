class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] b = new int[nums.length * 2];  

      for (int i = 0; i < nums.length; i++) {
             b[i] = nums[i];           
               b[i + nums.length] = nums[i]; 
      }
return b;
    }
}
