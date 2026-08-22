class Solution {
    public int[] findEvenNumbers(int[] digits) {
          List<Integer> list = new ArrayList<>();
          Set<Integer>set=new HashSet<>();

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] == 0) continue;

            for (int j = 0; j < digits.length; j++) {

                if (j == i) continue;

                for (int k = 0; k < digits.length; k++) {

                    if (k == i || k == j) continue;

                    int z = digits[i] * 100
                          + digits[j] * 10
                          + digits[k];

                    if (z % 2 == 0) {
                        set.add(z);
                    }
                }
            }
        }

       

        int[] a = new int[set.size()];

        // for (int i = 0; i < set.size(); i++) {
        //     a[i] = set.get(i);
        // }
        int u=0;
        for(int i:set){
a[u]=i;
u++;
        }
        Arrays.sort(a);

        return a;
        
}
}