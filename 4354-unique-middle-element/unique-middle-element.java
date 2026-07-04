class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        for(var x:mp.entrySet()){
            if(x.getKey()==nums[n]&&x.getValue()==1)return true;
        }
        return false;
    }
}