/*Given an unsorted array A of size N that contains only non negative integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.*/

//approach: two pointer
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        if (n == 0) return new ArrayList<>();
        int i = 0, j = 0, sum = arr[0];
        while (j < n && i < n) {
            if (sum < s && j < n - 1) {
                j++;
                sum += arr[j];
            } else if (sum == s) {
                break;
            } else {
                sum -= arr[i];
                i++;
                if (i > j && j < n - 1) {
                    j++;
                    sum += arr[j];
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(sum != s || i >= n || j >= n)
            ans.add(-1);
        else {
            ans.add(i + 1);
            ans.add(j + 1);
        }
        return ans;
    }
}
