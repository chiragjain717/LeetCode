class Solution {
    public long gcdSum(int[] nums) {
        
        int a[] = new int[nums.length];

        int m = nums[0];
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] > m) {
                m = nums[i];
            }
         int x = nums[i];
            int y = m;
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }

            a[i] = x;
        }

        Arrays.sort(a);

        long z = 0;

        int l = 0;
        int r = a.length - 1;

        while (l < r) {

            int x = a[l];
            int y = a[r];

            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }

            z+= x;
            l++;
            r--;
        }

        return z;
    }
}