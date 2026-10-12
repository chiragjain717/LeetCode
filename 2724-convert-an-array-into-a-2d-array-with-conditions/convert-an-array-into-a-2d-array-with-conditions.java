class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<>();

while (true) {
    boolean found = false;

    for (int i : nums) {
        if (i != -1) {
            list1.add(check(nums));
            found = true;
            break;
        }
    }

    if (!found) {
        break;
    }
}

return list1;
    }
    public static List<Integer> check(int a[]){
              List<Integer>list=new ArrayList<>();
              Set<Integer>set=new HashSet<>();
            for(int i=0;i<a.length;i++){
            if(a[i]!=-1&&!set.contains(a[i])){
                list.add(a[i]);
                set.add(a[i]);
                a[i]=-1;
            }
        }
        return list;
    }
}