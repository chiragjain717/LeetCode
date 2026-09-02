class Solution {
    public int balancedStringSplit(String s) {
        int x=0,z=0;
        for(char ch:s.toCharArray()){
           if(ch=='R')z++;
           else{
            z--;
           }
           if(z==0)x++;
        }
        return x;
    }
}