/*Input: 
N = 8
Output: 
YES
Explanation:
8 is equal to 2 raised to 3 (23 = 8).*/
//approach: if 'AND' of n and n-1 is zero then return power of 2
class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n==0) return false;
        if((n & n-1)==0) return true;
        else return false;
        
        
    }
    
}
