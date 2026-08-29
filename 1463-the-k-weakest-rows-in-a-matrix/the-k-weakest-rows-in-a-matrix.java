class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
      int n=mat.length;
      int m=mat[0].length;
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        int c=0;
        for(int j=0;j<m;j++){
            if(mat[i][j]==1){
                c++;
        }
        a[i]=c;
      } 
      }

      Map<Integer,Integer>mp=new HashMap<>();
      for(int i=0;i<a.length;i++){
        mp.put(i,a[i]);
      }
      System.out.println(mp);
     
      int y[]=new int[k];
      int i=0;
     while(i<k){
 int u=Integer.MAX_VALUE;
 int o=0,l=0;
      for(var x:mp.entrySet()){
      if(x.getValue()<u){
        o=x.getKey();
        u=x.getValue();
      }

      }
      y[i]=o;
      i++;
      mp.remove(o);
   
     }
     return y;



   }
}