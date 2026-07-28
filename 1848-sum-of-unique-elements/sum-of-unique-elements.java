class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(var x:mp.entrySet()){
            if(x.getValue()==1){
                sum+=x.getKey();
            }
        }
        return sum;
  }
}