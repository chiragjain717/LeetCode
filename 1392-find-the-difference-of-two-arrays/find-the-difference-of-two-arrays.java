class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for (int i : nums1) set1.add(i);
        for (int i : nums2) set.add(i);

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        for (int i : set1) {
            if (!set.contains(i))
                list1.add(i);
        }
        list.add(list1);

        List<Integer> list2 = new ArrayList<>();
        for (int i : set) {
            if (!set1.contains(i))
                list2.add(i);
        }
        list.add(list2);

        return list;
    }
}