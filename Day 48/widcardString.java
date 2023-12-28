/*Given two strings wild and pattern. Determine if the given two strings can be matched given that, wild string may contain * and ? but string pattern will not. * and ? can be converted to another character according to the following rules:

* --> This character in string wild can be replaced by any sequence of characters, it can also be replaced by an empty string.
? --> This character in string wild can be replaced by any one character.
Example 1:

Input: 
wild = ge*ks
pattern = geeks
Output: Yes
Explanation: Replace the '*' in wild string 
with 'e' to obtain pattern "geeks".*/
class Solution{
    static boolean solve(int i,int j,String wild,String pat,boolean dp[][]){
        if(i<0 && j<0) return true;
        if(i<0 && j>=0) return false;
        if(j<0 && i>=0){
            for(int k = 0;k<=i;k++){
                if(wild.charAt(k)!='*') return false;
            }
            return true;
        }
        if(dp[i][j]) return true;
        if(wild.charAt(i)==pat.charAt(j) || wild.charAt(i)=='?'){
            return dp[i][j] = solve(i-1,j-1,wild,pat,dp);
        }
        if(wild.charAt(i)=='*'){
            return dp[i][j] = solve(i,j-1,wild,pat,dp) || solve(i-1,j,wild,pat,dp);
        }
        return dp[i][j] = false;
    }
    static boolean match(String wild, String pattern)
    {
        int n = wild.length();
        int m = pattern.length();
        boolean dp[][] = new boolean[n][m];
        return solve(n-1,m-1,wild,pattern,dp);
    }
}
