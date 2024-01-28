/*Given a string str and another string patt. Find the minimum index of the
character in str that is also present in patt.


Example 1:

Input:
str = geeksforgeeks
patt = set
Output: 1
Explanation: e is the character which is
present in given str "geeksforgeeks"
and is also present in patt "set". Minimum
index of e is 1. */
class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        // int ind=0;
        // int minInd=Integer.MAX_VALUE;
        // for(int i=0;i<patt.length();i++){
        //     String t=String.valueOf(patt.charAt(i));
        //     if(str.contains(t)){
        //         ind= str.indexOf(patt.charAt(i));
        //         minInd=Math.min(ind,minInd);
        //     }
        // }
        // if(minInd==Integer.MAX_VALUE)return -1;
        // else return minInd;
        
        for(int i=0;i<str.length();i++){
            if(patt.contains(str.charAt(i)+""))
                return i;
        }
        return -1;
    }
}
