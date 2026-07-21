class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int o=0,z=0;
        for(var x:mp.entrySet()){
            int u=x.getKey();
              if(x.getValue()>o){
                   o=x.getValue();
                   z=u;

              }
        }
        return z;
    }
}