/*Given an array arr of n elements in the following format {a1, a2, a3, a4, ... , an/2, b1, b2, b3, b4, ... , bn/2}, 
the task is shuffle the array to {a1, b1, a2, b2, a3, b3, ... , an/2, bn/2} without using extra space.
Note that n is even.

Example 1:

Input: 
n = 4, arr = {1, 2, 9, 15}
Output:  
1 9 2 15
Explanation: 
a1=1, a2=2, b1=9, b2=15. So the final array will be: a1, b1, a2, b2 = {1,9,2,15}.
  */
class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        int j = n/2 , count = 0;
        long ls[] = new long[n];
        for(int i = 0 ; i < n/2 ; i++,j++)
        {
            ls[count++] = arr[i];
            ls[count++] = arr[j];
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = ls[i];
        }
    }
}
