class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            int c = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target) {
                   c++;
                }

                int z = j - i ;
                z++;

                if (c > z / 2) {
                    x++;
                }
            }
        }

        return x;  
    }
}