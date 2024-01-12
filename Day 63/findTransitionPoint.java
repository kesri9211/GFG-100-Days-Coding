/*Given a sorted array containing only 0s and 1s, find the transition point, i.e., the first index where 1 was observed, and before that, only 0 was observed.

Example 1:
Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition 
point where 1 begins.*/

class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        for(int i=0;i<n;i++){
            if(arr[i]==1) return i;
        }
        return -1;
    }
}
