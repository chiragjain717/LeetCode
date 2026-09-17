class Solution {
    public int[] findDegrees(int[][] matrix) {
        int a[]=new int[matrix.length];
        int m= matrix.length;
        int n= matrix[0].length;
      for(int i=0;i<m;i++){
        int sum=0;
        for(int j=0;j<n;j++){
          sum+=matrix[i][j];
        }
        a[i]=sum;
      } 
      return a; 
    }
}