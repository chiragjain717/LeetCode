class Solution {
    public int maxDepth(String s) {
        int x=0,z=0;
      for(char ch:s.toCharArray()){
        if(ch=='(')x++;
        if(ch==')')x--;
        z=Math.max(z,x);
      }
      return z;  
    }
}