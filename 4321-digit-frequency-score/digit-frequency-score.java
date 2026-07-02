class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer>mp=new HashMap<>();
        while(n>0){
            int x=n%10;
            mp.put(x,mp.getOrDefault(x,0)+1);
            n/=10;
        }
        int z=0;
        for(var x:mp.entrySet()){
            z+=x.getKey()*x.getValue();
        }
        return z;
    }
}