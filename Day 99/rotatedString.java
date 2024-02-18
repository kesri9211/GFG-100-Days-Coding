/*Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.
Example 1:
Input:
a = amazon
b = azonam
Output: 
1
Explanation: 
amazon can be rotated anti-clockwise by two places, which will make it as azonam.
*/
class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length()<2 || str2.length()<2)return false;
         // Check left rotation
        String leftRotation = str1.substring(2) + str1.substring(0, 2);

        // Check right rotation
        String rightRotation = str1.substring(str1.length() - 2) + str1.substring(0, str1.length() - 2);

        // Check if str2 matches either left or right rotation
        return str2.equals(leftRotation) || str2.equals(rightRotation);
    }
    
}
