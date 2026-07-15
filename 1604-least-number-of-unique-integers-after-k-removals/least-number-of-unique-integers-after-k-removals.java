class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
    Map<Integer,Integer>mp=new TreeMap<>();
    for(int i:arr){
        mp.put(i,mp.getOrDefault(i,0)+1);

    }
    Map<Integer,Integer>mp1=sorted(mp);
    int u = mp1.size();

for (var x : mp1.entrySet()) {
    if (k >= x.getValue()) {
        k -= x.getValue();
        u--;
    } else {
        break;
    }
}

return u;
    
    }
    private static Map<Integer,Integer>sorted(Map<Integer,Integer>mp){
    Map<Integer,Integer>sortedmp=new LinkedHashMap<>();
    Set<Map.Entry<Integer,Integer>>set=mp.entrySet();
     List<Map.Entry<Integer,Integer>>list=new ArrayList<>(set);
     list.sort((x,y)->x.getValue().compareTo(y.getValue()));
     for(Map.Entry<Integer,Integer> e:list){
        sortedmp.put(e.getKey(),e.getValue());
     }
     return sortedmp;
    }

}