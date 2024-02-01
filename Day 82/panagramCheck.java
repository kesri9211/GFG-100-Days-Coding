/*Given a string s check if it is "Panagram" or not.

A "Panagram" is a sentence containing every letter in the English Alphabet.
Example 1:

Input:
s = "Bawds jog, flick quartz, vex nymph"
Output: 
1
Explanation: 
In the given input, there
are all the letters of the English
alphabet. Hence, the output is 1.*/
//approach: hashset
class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        s=s.toLowerCase();
        HashSet<Character>ans=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=97 && ch<=122)
                ans.add(ch);
        }
        if(ans.size()==26)return true;
        return false; 
    }
    
}
