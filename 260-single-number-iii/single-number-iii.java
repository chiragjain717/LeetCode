class Solution {
    public int[] singleNumber(int[] nums) {
    Map<Integer,Integer>mp=new HashMap<>();
    for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
    }
    int a[]=new int[2];
int y=0;
    for(var x:mp.entrySet()){
        int z=x.getValue();
         int w=x.getKey();
         if(z==1){
a[y++]=w;
         }

    }
    return a;
    }
}