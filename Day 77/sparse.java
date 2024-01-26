/*Given a number N. The task is to check whether it is sparse or not. 
A number is said to be a sparse number if no two or more consecutive bits are set in 
the binary representation.

Example 1:
Input: N = 2
Output: 1
Explanation: Binary Representation of 2 is 10, 
which is not having consecutive set bits. 
So, it is sparse number.*/

class Solution
{
    //Function to check if the number is sparse or not.
    public static boolean isSparse(int n)
    {
          if((n&n<<1)==0)
        {
            return true;
        }
        else
        {
           return false; 
        }
    }
    
}
