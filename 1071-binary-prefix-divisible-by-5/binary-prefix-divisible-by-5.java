class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int sum=0;
         ArrayList<Boolean>List=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        // sum+=nums[i]*(int)Math.pow(2,i);
        sum=(sum*2+nums[i])%5;
         if( sum==0){
      List.add(true);
         }
         else{
      List.add(false);
         }
        }
   return List;
    }
}