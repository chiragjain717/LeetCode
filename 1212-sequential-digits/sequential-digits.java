class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s=Integer.toString(low);
        String x=Integer.toString(high);
        List<Integer>list=new ArrayList<>();
    //     int i=1;
    //   while(low<=high){
    //     String h="";
    //     int z=i;
    //     int y=0;
    //          while(h.length()<s.length()){
    //           y=y*10+z;
    //           z++;
    //          h+=(char)y;
    //          }
    //          list.add(y);
    //          low=y;
    //          i++;
    //   } 
    //   return list
           for (int i = s.length(); i <= x.length(); i++) {

            for (int j = 1; j <= 10 - i; j++) {

                int num = 0;
                int digit = j;

                while (digit < j +i) {
                    num = num * 10 + digit;
                    digit++;
                }

                if (num >= low && num <= high) {
                    list.add(num);
                }
            }
        }

        return list;

    }
}