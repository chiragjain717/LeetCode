class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
         Map<Integer,Integer>mp1=sorted(mp);
         int a[]=new int[nums.length];
         int i=0;
         for(var x:mp1.entrySet()){
            int y=x.getKey();
            int z=x.getValue();
            while(z>0){
                a[i++]=y;
                z--;
            }
         }
         return a;
    }
    private static  Map<Integer,Integer>sorted( Map<Integer,Integer>mp){
     Map<Integer,Integer>sortedmp=new LinkedHashMap<>();
     Set<Map.Entry<Integer,Integer>>set=mp.entrySet();
     List<Map.Entry<Integer,Integer>>list=new ArrayList<>(set);
     //list.sort((x,y)->x.getValue().compareTo(y.getValue()));
     list.sort((x, y) -> {
    if (!x.getValue().equals(y.getValue())) {
        return x.getValue().compareTo(y.getValue());
    }
    return y.getKey().compareTo(x.getKey()); 
});
     for( Map.Entry<Integer,Integer>e:list){
        sortedmp.put(e.getKey(),e.getValue());
     }
     return sortedmp;
    }
}