class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,Integer>mp=new HashMap<>();
        List<List<Integer>>list=new ArrayList<>();
        for(int i:groupSizes){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        System.out.println(mp);
        for (var x : mp.entrySet()) {

    List<Integer> list1 = new ArrayList<>();
    int c = 0;

    for (int i = 0; i < groupSizes.length; i++) {

        if (groupSizes[i] == x.getKey()) {

            list1.add(i);  

            c++;

            if (c == x.getKey()) {
                list.add(list1);
                list1 = new ArrayList<>();
                c = 0;
            }
        }
    }
}

return list;
        
    }
}