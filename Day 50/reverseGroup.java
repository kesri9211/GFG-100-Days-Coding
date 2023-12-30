/*Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
Note: If at any instance, there are no more subarrays of size greater than or equal to K, then reverse the last subarray (irrespective of its size). You shouldn't return any array, modify the given array in-place.

Example 1:
Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
//User function Template for Java
//approach: reverse subarray
class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        if(k>n) Collections.reverse(arr.subList(0,n));
        else{
            int m=n;
            int j=0;
            while(m>k){
                Collections.reverse(arr.subList(j,j+k));
                j+=k;//increase j to get sub-array
                m-=k;//decrease m everytime and it should be greater than k otherwise array will be out of bound
            }
            //reverse remaining element(m<k)
            Collections.reverse(arr.subList(j,n));
        }
        
    }
}
