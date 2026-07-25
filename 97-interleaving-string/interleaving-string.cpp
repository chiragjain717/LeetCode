class Solution {
    bool f(int idx, int i, int j, vector<vector<int>>&dp, string s1, string s2, string s3) {
        if(idx == s3.size()){
            return true;
        }
        if(dp[i][j] != -1) return dp[i][j];
        bool ans = false;

        if(s1[i] == s3[idx] && s2[j] == s3[idx]){
            ans |= f(idx + 1, i + 1, j, dp, s1, s2, s3) || f(idx + 1, i, j + 1, dp, s1, s2, s3);
        }
        else if(s1[i] == s3[idx]) {
            ans |= f(idx + 1, i + 1, j, dp, s1, s2, s3);
        }
        else if(s2[j] == s3[idx]) {
            ans |= ans |= f(idx + 1, i, j + 1, dp, s1, s2, s3);
        }
        else {
            ans = false;
        }
        return dp[i][j] = ans;
    }
public:
    bool isInterleave(string s1, string s2, string s3) {
        int x = s3.size();
        int n = s1.size();
        int m = s2.size();
        if(n + m != x) return false;
        vector<vector<int>>dp(n + 1, vector<int>(m + 1, -1));
        return f(0, 0, 0, dp, s1, s2, s3);
        
    }
};