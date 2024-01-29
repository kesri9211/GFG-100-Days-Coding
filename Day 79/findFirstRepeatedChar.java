/*Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose
index of second occurrence is smallest. S contains only lowercase letters.
Example 1:

Input: S="geeksforgeeks"
Output: e
Explanation: 'e' repeats at third position.*/
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        int ind=-1;
        int min=Integer.MAX_VALUE;
        char ele='a';
        for(int i=0;i<s.length();i++){
            int flage=0;
            for(int j=i+1;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
                ind=j;
                flage=1;
                break;
                }
            }
            if(flage==1 && min>ind){
                min=ind;
                ele=s.charAt(ind);
            }
        }
        if(ind==-1) return "-1";
        return String.valueOf(ele);
    }
} 
