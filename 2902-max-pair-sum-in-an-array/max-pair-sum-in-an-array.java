class Solution {
    public int maxSum(int[] nums) {
      int a[]=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        int u=nums[i];
        int x=0;
        while(u>0){
       x=Math.max(x,u%10);
        u/=10;
        }
        a[i]=x;
      } 
      int max=-1;
      for(int i=0;i<a.length;i++){
       for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
            max=Math.max(max,nums[i]+nums[j]);
        }
       }
      }
      return max; 
    }
}