/*Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome*/
class Solution {
    int isPalindrome(String S) {
        // code here
        int r=S.length()-1;
        int l=0;
        while(l<r){
            if(S.charAt(l)!=S.charAt(r))
                return 0;
            l++;
            r--;
        }
        return 1;
    }
};
