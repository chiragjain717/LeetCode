class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x)list.add(i);
        }
        int a[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
       if (queries[i] <= list.size()) {
                a[i] = list.get(queries[i] - 1);
            } else {
                a[i] = -1;
            }
        }

        return a;
    }
}