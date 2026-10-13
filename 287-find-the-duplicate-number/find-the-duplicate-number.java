class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        int z=0,k=0;
        for(var x:mp.entrySet()){
            if(x.getValue()>z){
                z=x.getValue();
                k=x.getKey();
            }
        }
        return k;
        
    }
}