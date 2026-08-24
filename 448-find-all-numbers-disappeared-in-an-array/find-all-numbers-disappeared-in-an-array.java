class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
//          Arrays.sort(nums);
//         List<Integer> list = new ArrayList<>();

//         int t = 1;  
//  for (int i = 0; i < nums.length; i++) {
//  if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue;
//             }
//          while (t < nums[i]) {
//                 list.add(t);
//                 t++;
//             }
//       if (nums[i] == t) {
//                 t++;
//             }
//         }
//      while (t <= nums.length) {
//             list.add(t);
//             t++;
//         }

//         return list;
Set<Integer> set = new HashSet<>();

for (int x : nums) {
    set.add(x);
}

List<Integer> list = new ArrayList<>();

for (int i = 1; i <= nums.length; i++) {
    if (!set.contains(i)) {
        list.add(i);
    }
}

return list;

    }    
}