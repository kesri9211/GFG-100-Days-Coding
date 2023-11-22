/*Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. 
  An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
  For example, act and tac are an anagram of each other.*/
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        //return new String(a+a).contains(b);
        
        //convert into character array
        char ca[]=a.toCharArray();
        char cb[]=b.toCharArray();
        //sort character array
        Arrays.sort(ca);
        Arrays.sort(cb);
        if(ca.length!=cb.length)    return false;
        //check whether both has same character or not
        for(int i=0;i<a.length();i++){
            if(ca[i]!=cb[i])
                return false;
        }
        return true;
    }
}
