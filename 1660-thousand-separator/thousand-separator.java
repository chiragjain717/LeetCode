class Solution {
    public String thousandSeparator(int n) {
    String s=Integer.toString(n);
    int c=1;
    String g="";
    for(int i=s.length()-1;i>=0;i--){
         char ch=s.charAt(i);
         g=ch+g;
         if(c%3==0&&i!=0){
            g="."+g;
         } 
         
    c++; 
    }
    return g;
    }
}