/*You are given an array a, of n elements. Find the minimum index based distance between two distinct elements of the array, x and y. Return -1, if either x or y does not exist in the array.

Example 1:

Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.*/


class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int x_index=-1;
        int y_index=-1;
        int result=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
          if(a[i]==x){
           x_index=i;
          }
          if(a[i]==y){
           y_index=i;
          }
          if(x_index!=-1 && y_index!=-1){
            result=Math.min(result,Math.abs(x_index-y_index));
          }
        }
        if(result==Integer.MAX_VALUE) return -1;
        return result;
    }
}
