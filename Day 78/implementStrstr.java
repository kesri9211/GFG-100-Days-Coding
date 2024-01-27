/*Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns an integer denoting the first occurrence of the string x in s (0 based indexing).

Note: You are not allowed to use inbuilt function.
Example 1:

Input:
s = GeeksForGeeks, x = Fr
Output: -1*/
class GfG
{
    int strstr(String s, String x)
    {
       // Your code here
       if(s.contains(x)) return s.indexOf(x);
       return -1;
    }
}
