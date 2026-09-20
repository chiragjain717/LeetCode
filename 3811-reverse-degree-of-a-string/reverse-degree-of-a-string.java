class Solution {
    public int reverseDegree(String s) {
    int x=0;
      for(int i=0;i<s.length();i++){
        int z=Math.abs(s.charAt(i)-'z')+1;
          x+=z*(i+1);

      }
      return x;
    }
}