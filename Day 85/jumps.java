/*Given an array of N integers arr[] where each element represents the maximum length of the jump that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.

Note: Return -1 if you can't reach the end of the array.


Example 1:

Input:
N = 11 
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
Output: 3 
Explanation: 
First jump from 1st element to 2nd 
element with value 3. Now, from here 
we jump to 5th element with value 9, 
and from here we will jump to the last. */
class Solution{
    static int minJumps(int[] arr){
      int n=arr.length;
        
        if(n==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int jumps=0;
        int max1=0;
        int range=0;
        
        for(int i=0;i<n;i++){
            max1=Math.max(max1,i+arr[i]);
            if(range==i){
                range=max1;
                jumps++;
                if(range>=n-1){
                    return jumps;
                }
            }
        }
        
        
        return -1;
    }
}
