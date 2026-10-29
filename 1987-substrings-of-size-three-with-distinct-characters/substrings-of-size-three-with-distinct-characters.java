class Solution {
    public int countGoodSubstrings(String s) {
//        Map<String,Integer>mp=new HashMap<>();
//         int i=0,j=0;
//         while(j<s.length()){
//            if(j-i+1==3){
//          String h = s.substring(i, j);
//             i++;
//             char[] arr = h.toCharArray();
// Arrays.sort(arr);
// mp.put(Arrays.toString(arr),mp.getOrDefault(Arrays.toString(arr),0)+1);
//            }
//            j++;
//         }
//         int y=0;
//     for(var x:mp.entrySet()){
//         if(x.getValue()>y){
//             y=x.getValue();
//         }

//     }
//     return y;
 int i = 0, j = 0;
        int count = 0;

        while (j < s.length()) {
            if (j - i + 1 == 3) {
                char a = s.charAt(i);
                char b = s.charAt(i + 1);
                char c = s.charAt(j);

                if (a != b && b != c && a != c) {
                    count++;
                }

                i++;
            }
            j++;
        }

        return count;
    }
}