class Solution {
    public boolean isSubsequence(String s, String t) {
        //  String m="";
        // HashSet<Character>set=new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     set.add(ch);

        // }
        // for(int i=0;i<t.length();i++){
        //     char ch=t.charAt(i);
        //     if(set.contains(ch)){
        //         m+=ch;
        //     }

        // }
        // if(s.equals(m)) return true;
        // return  false
        int i = 0, j = 0;

    while (i < s.length() && j < t.length()) {
        if (s.charAt(i) == t.charAt(j)) {
            i++;
        }
        j++;
    }

    return i == s.length();

    }
}