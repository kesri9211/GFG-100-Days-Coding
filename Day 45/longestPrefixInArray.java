/*N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.*/
class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        int flag=0;
        String s="";
        String str = arr[0];
        int min = Integer.MAX_VALUE;
        for(String s1:arr)
        {
            int l = s1.length();
            if(l<min)
            min=l;
        }
        for(int i=0;i<min;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                String str2 = arr[j];
                if(str.charAt(i)!=str2.charAt(i))
                flag=1;
            }
            if(flag==0)
            s=s.concat(String.valueOf(str.charAt(i)));
            else if(flag==1 && s.isEmpty())
            return "-1";
            else
            return s;
        }
        
        return s;
        
    }
}
