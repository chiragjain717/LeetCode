class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        int x = 0;
        int y = 0;

        for (int count : mp.values()) {
            x += count / 2;
            y += count % 2;
        }
        int a[]=new int[2];
        a[0]=x;
        a[1]=y;

        return a;
    }
}