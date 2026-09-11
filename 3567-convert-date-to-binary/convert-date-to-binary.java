class Solution {
    public String convertDateToBinary(String date) {
      String h="";
      int y=0;
      for(char ch:date.toCharArray()){
       if(ch=='-'){
        String s="";
            while(y>0){
                int x=y%2;
                s=Integer.toString(x)+s;
                y/=2;
          }
        s+='-';
        h+=s;
        }
        else{
        y=y*10+ch-'0';
        }
       
      }
      String g="";
       while(y>0){
                int x=y%2;
                g=Integer.toString(x)+g;;
                y/=2;
          }
      return h+=g; 
    }
}