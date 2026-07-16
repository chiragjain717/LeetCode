class Solution {
    public int subarraySum(int[] nums, int k) {
    
        int c=0;
       // int a[]=new int[nums.length];
        int sum=0;
    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]==k)c++;
    //     sum+=nums[i];
    //      if(sum>=k){
    //     a[i]=sum;
    //     sum=nums[i];

    //     }
       

    //    }
    //    for(int i:a){

    //     //System.out.println(i);
    //  if(i==k)c++;
    //    }
    Map<Integer,Integer>mp=new HashMap<>();
 mp.put(0,1);
 for(int i=0;i<nums.length;i++){
    sum+=nums[i];
    int x=sum-k;
    if(mp.containsKey(x)){
     c+=mp.get(x);
    }
    mp.put(sum,mp.getOrDefault(sum,0)+1);
}
        return c;
    }
}