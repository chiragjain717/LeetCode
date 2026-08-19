class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] a = new int[nums.length];

        int x = 0;
        int y = 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                a[x] = num;
                x += 2;
            } else {
                a[y] = num;
                y += 2;
            }
        }

        return a;
    }
}