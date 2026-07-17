class Solution {
    public String restoreString(String s, int[] indices) {
        // String h="";
        // for(int i=0;i<indices.length;i++){
        //     h+=s.charAt(indices[i]);
        // }
        // return h;
        char[] ch= new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            ch[indices[i]] = s.charAt(i);
        }

        return new String(ch);
    }
}