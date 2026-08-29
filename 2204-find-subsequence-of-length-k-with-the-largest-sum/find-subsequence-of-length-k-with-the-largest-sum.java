class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
     if (k == nums.length) return nums;

        int t[] = new int[k];

        int temp[][] = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            temp[i][0] = nums[i];
            temp[i][1] = i;       
        }

        Arrays.sort(temp, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < k; i++) {
            t[i] = temp[i][1];
        }

        Arrays.sort(t);

        for (int i = 0; i < k; i++) {
            t[i] = nums[t[i]];
        }

        return t;
       
        
    }
}