class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
    int n=matrix.length;
    int m=matrix[0].length;
    int t[]=new int[n];
    int y[]=new int[m];
    for(int i=0;i<n;i++){
        int f=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
        f=Math.min(f,matrix[i][j]);
        }
        t[i]=f;
    }
    for(int i=0;i<m;i++){
        int f=0;
        for(int j=0;j<n;j++){
            f=Math.max(f,matrix[j][i]);
             }
             y[i]=f;
    }
    for(int i=0;i<y.length;i++){
        set.add(y[i]);
    }
    for(int i=0;i<t.length;i++){
        if(set.contains(t[i])){
            list.add(t[i]);
        }
    }
return list;
    }
}