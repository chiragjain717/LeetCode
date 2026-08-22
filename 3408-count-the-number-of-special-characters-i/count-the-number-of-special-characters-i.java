class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character>set=new HashSet<>();
        for(int i=0;i<word.length();i++){
               if(!set.contains(word.charAt(i))){
                for(int j=0;j<word.length();j++){
                int x=word.charAt(i)-'0';
                int y=word.charAt(j)-'0';
                if(Math.abs(x-y)==32){
                    set.add(word.charAt(i));
                    set.add(word.charAt(j));
                    break;
                }
               }


            }
        }
        return set.size()/2;
        
        
    }
}