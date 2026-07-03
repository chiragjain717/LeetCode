class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    //     Set<Integer> set=new LinkedHashSet<>();
    //    for(int i=0;i<nums1.length;i++){
    //     for(int j=0;j<nums2.length;j++){
    //         if(nums1[i]==nums2[j]){
    //             set.add(nums1[i]);
    //         }
    //     }
    //    }
    //    int a[]=new int[set.size()];
    //    int i=0;
    //  for(int v:set){
    //     a[i++]=v;
    //  }
    //    return a;/

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int x : nums1) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
       ArrayList<Integer> list = new ArrayList<>();
        for (int x : nums2) {
            if (mp.containsKey(x) && mp.get(x) > 0) {
                list.add(x);
                mp.put(x, mp.get(x) - 1);
            }
        }

        int[] z = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            z[i] = list.get(i);
        }

        return z;
    }
}