class Solution {
    public boolean halvesAreAlike(String s) {
       int x=s.length()/2;
       int y=0,z=0;

       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u'
        ||ch =='A'||ch==  'E'||ch== 'I' ||ch== 'O' ||ch=='U'){
            if(i<x)y++;
            else z++;
        }

       } 
       if(y==z)return true;
       return false;
    }
}