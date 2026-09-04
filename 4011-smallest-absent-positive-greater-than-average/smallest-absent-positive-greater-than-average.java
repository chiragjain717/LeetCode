class Solution {
    public int smallestAbsent(int[] nums) {
             int x = 0;

        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
            x += i;
        }

        double avg = (double)x / nums.length;

        x = (int)avg + 1;

        while(true){
            if(x > 0 && !set.contains(x))
                return x;

            x++;
        }
   
         }
}