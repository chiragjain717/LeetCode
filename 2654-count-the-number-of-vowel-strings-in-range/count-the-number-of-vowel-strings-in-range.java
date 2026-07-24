class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int x=0;
        for(int i=left;i<=right;i++){
            String g=words[i];
            char ch=g.charAt(0);
            char c=g.charAt(g.length()-1);
            if(check(ch)==true&&check(c)==true)x++;
            

        }
        return x;
    }
    public static boolean  check(Character ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')return true;
        return false;
    } 
}