class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        // for(int i=0;i<words.length;i++){
        //     String g=words[i];
        //     Set<Character>set=new HashSet<>();
        //     for(char ch:g.toCharArray()){
        //         set.add(ch);
        //     }
        //     for(int j=i+1;j<words.length;j++){
        //         String x=words[j];
        //          boolean check=false;
        //         for(char ch:x.toCharArray()){
        //             if(set.contains(ch)){
        //                 check=true;
        //                 break;
        //             }
        //         }
        //         if(check==false)max=Math.max(max,g.length()*x.length());
        // }
           
        // }

for (int i = 0; i < words.length; i++) {
    boolean[] arr = new boolean[26];

    for (char ch : words[i].toCharArray()) {
        arr[ch - 'a'] = true;
    }

    for (int j = i + 1; j < words.length; j++) {
        boolean check = false;

        for (char ch : words[j].toCharArray()) {
            if (arr[ch - 'a']) {
                check = true;
                break;
            }
        }

        if (!check) {
            max = Math.max(max, words[i].length() * words[j].length());
        }
    }
}
        return max;
    }
}