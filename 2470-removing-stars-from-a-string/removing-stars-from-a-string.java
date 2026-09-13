class Solution {
    public String removeStars(String s) {
        Stack<Character>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                if(!stack.isEmpty()){
                stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        String g="";
        while(!stack.isEmpty()){
           g=stack.peek()+g;
           stack.pop();
        }
        return g;
    }
}