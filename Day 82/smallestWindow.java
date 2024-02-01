/*Given two strings S and P. Find the smallest window in the string S consisting of all the characters(including duplicates) of the string P.  Return "-1" in case there is no such window present. In case there are multiple such windows of same length, return the one with the least starting index.
Note : All characters are in Lowercase alphabets. 

Example 1:

Input:
S = "timetopractice"
P = "toc"
Output: 
toprac
Explanation: "toprac" is the smallest
substring in which "toc" can be found.*/
class Solution
{
    
    static boolean eligible( HashMap<Character,Integer> org, HashMap<Character,Integer> map)
    {
        for(Character key: map.keySet()){
                
                 if(map.get(key)<org.get(key))
                 return false;
            }
        
            return true;
    }
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        HashMap<Character,Integer> org= new HashMap<>();
        HashMap<Character,Integer> temp= new HashMap<>();
        for(char x:p.toCharArray())
        {
            if(!org.containsKey(x))
            {
                org.put(x,1);
                temp.put(x,0);
            }
            else
            {
                org.put(x,org.get(x)+1);
            }
        }
        int minlen=s.length()+1;
        String ans="-1";
        int left=0,right=0;
        while(right<s.length())
        {
           
            char x=s.charAt(right);
            if(temp.containsKey(x))
            {
                
                temp.put(x,temp.get(x)+1);
            }
           
                while(eligible(org,temp))
                {
                        if(minlen>right-left+1)
                        {
                           
                            minlen=right-left+1;
                            ans=s.substring(left,right+1);
                           
                        }
                        if(temp.containsKey(s.charAt(left)))
                        {
                           
                             temp.put(s.charAt(left),temp.get(s.charAt(left))-1);
                        }
                        left++;
                
                }
            
            right++;
        }
        return ans;
    }
}
