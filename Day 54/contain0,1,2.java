/*Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.

Example 1:

Input:
S = 01212
Output:
3
Explanation:
The substring 012 is the smallest substring
that contains the characters 0, 1 and 2.*/
class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int zero=-1;
        int one =-1;
        int two=-1;
        int ans=Integer.MAX_VALUE;
        int mini,maxi;
        
        for(int i=0;i<S.length();i++)
        {
            //storing index of 0,1,2
            if(S.charAt(i)=='0')
            zero=i;
            else if(S.charAt(i)=='1')
            one=i;
            else if(S.charAt(i)=='2')
            two=i;
            
            if(zero!=-1 && one!=-1 && two!=-1)
            {
                mini=Math.min(zero,Math.min(one,two));
                maxi=Math.max(zero,Math.max(one,two));
                //point to note
                ans=Math.min(ans,(maxi-mini+1));
            }
        }
        
        if(ans==Integer.MAX_VALUE)
        return -1;
        else
        return ans;
    }
};
