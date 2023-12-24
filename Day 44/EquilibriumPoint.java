/*Given an array A of n positive numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 
3 
Explanation:  
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2). */

class Solution {
  //Approach: prefix sum
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long a[], int n) {

        // Your code here
        if(n==1){return 1;}
        if(n==2) {return -1;}
        
        for(int i=1;i<n;i++){
            a[i]=a[i]+a[i-1];
        }
        int point=-1;
        for(int i=1;i<n-1;i++){
            //LINE TO REMEMBER
            if(a[i-1]==(a[n-1]-a[i])){
                point=i+1;
            }
        }
        return point;
    }
}
