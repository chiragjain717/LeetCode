class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        Set<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
mp.put(i,mp.getOrDefault(i,0)+1);
set.add(i);
        }
        for(var x:mp.entrySet()){
            if(x.getValue()==1){
                if(!set.contains(x.getKey()-1)&&!set.contains(x.getKey()+1))list.add(x.getKey());
            }
        }
        return list;
    }

}