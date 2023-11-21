/*Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the maximum value.*/

//approach: return as soon as we found array starts decreasing

class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int i;
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
                return arr[i];
        }
        return arr[i]; //if no number found array is in increasing order
    }
}
