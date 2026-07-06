class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
    //     int m=intervals.length;
    //     int n=intervals[0].length;
    //     int a[][]=new int[2][2];
    //     int z=0;
    // a[0][0]=intervals[0][0];
    // a[0][1]=intervals[0][1];
    // for(int i=1;i<m;i++){
    //     int x=0;
    //     for(int j=0;j<n;j++){
    //         if(j==0){
    //         if(intervals[i][j]<=a[i-1][j])x++;
    //         }
    //         else if(a[i-1][j]<=intervals[i][j]){
    //             x++;
    //         }
    //         a[i][j]=intervals[i][j];
    //         }
    //         if(x==2)z++;
    // }
    //     return z;
    Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];
            return a[0] - b[0];
        });

        int m = intervals.length;
        int n = intervals[0].length;

        int a[][] = new int[m][2];
        int z = 0;

        a[0][0] = intervals[0][0];
        a[0][1] = intervals[0][1];

        for (int i = 1; i < m; i++) {

            int x = 0;

            for (int j = 0; j < n; j++) {

                if (j == 0) {
                    if (a[i - 1][j] <= intervals[i][j])
                        x++;
                } else {
                    if (intervals[i][j] <= a[i - 1][j])
                        x++;
                }

                a[i][j] = intervals[i][j];
            }

            if (x == 2) {
                z++;
                a[i][0] = a[i - 1][0];
                a[i][1] = a[i - 1][1];
            }
        }

        return m - z;
        
           }
}