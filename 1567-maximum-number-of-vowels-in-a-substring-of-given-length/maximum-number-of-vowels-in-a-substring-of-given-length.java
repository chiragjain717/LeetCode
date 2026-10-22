class Solution {
    public int maxVowels(String s, int k) {
        int i=0,j=0,x=0,y=0;
        while(j<s.length()){
            if(check(s.charAt(j)))y++;
            if(j-i+1==k){
                 x= Math.max(x,y);
                if(check(s.charAt(i)))y--;
                i++;
            }
            j++;
        }
        return x;
        
    }
    public static boolean check(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')return true;
        return false;
    }
}