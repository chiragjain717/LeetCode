class Solution {
    public boolean isGood(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        int l=nums.length-1;
        for(int i=0;i<nums.length;i++){
           mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

        }  
        // for(var x: mp.entrySet()){
        //     int k=x.getKey();
        //     int v=x.getValue();
        //     if(k==l&&v!=2)return false;
        //     else if(v>1)return false;
             

        // }
      for(int i = 1; i < l; i++){
            if(mp.getOrDefault(i,0) != 1){
                return false;
            }
        }
if(mp.getOrDefault(l,0)!=2)return false;
return true;
    }
}