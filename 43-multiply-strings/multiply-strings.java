import java.util.*;
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
     BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        BigInteger result = a.multiply(b);
        
        return result.toString();

    // List<Long> list = new ArrayList<>();
    //  while(f>0){
    //     long l=f%10;
    //     list.add(l);
    //     f/=10;
    //  }
    //  String s="";
    //  for(int i=0;i<list.size();i++){
    //     s=String.valueOf(list.get(i))+s;
    //  }
    

    }
}