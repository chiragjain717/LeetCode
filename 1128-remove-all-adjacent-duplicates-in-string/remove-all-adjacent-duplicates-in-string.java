class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
       for(char ch:s.toCharArray()){
       if(!st.isEmpty()&&ch==st.peek()){
        st.pop();
       }
       else{
        st.push(ch);
       }
       } 
       String g="";
       while(!st.isEmpty()){
        g=st.peek()+g;
        st.pop();
       }
       return g;
    }
}