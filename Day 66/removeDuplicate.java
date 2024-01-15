/*Given a sorted array A[] of size N, delete all the duplicated elements from A[]. Modify the array such that if there are X distinct elements in it then the first X positions 
  of the array should be filled with them in increasing order and return the number of distinct elements in the array.

Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the number of distinct elements(X) in the array, the driver code will print all the
  elements of the modified array from index 0 to X-1 as output of your code.

Input:
N = 4
Array = {1, 2, 2, 4}
Output: 3
Explation: After removing all duplicates modify array will contains {1, 2, 4} at first 3 positions so you should return 3 after modify the array.
  */
  
class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        //two pointer approach
        
        int i=0;
        for(int j=1; j<A.length; j++)
        {
            if(A[j] != A[i])
            {
                A[i+1] = A[j];
                i++;
            }
                
        }
        
        
        return i+1;
    }
}
