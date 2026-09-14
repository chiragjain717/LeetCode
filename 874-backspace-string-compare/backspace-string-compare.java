class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> st1=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty()){
                   st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
         for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!st1.isEmpty()){
                   st1.pop();
                }
            }
            else{
                st1.push(ch);
            }
        }
        if(st.equals(st1))return true;
        return false;

    }
}