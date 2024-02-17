/*Given an array arr of size n, the task is to check if the given array can be a level order representation of a Max Heap.

Example 1:

Input:
n = 6
arr[] = {90, 15, 10, 7, 12, 2}
Output: 
1
Explanation: 
The given array represents below tree
       90
     /    \
   15      10
  /  \     /
7    12  2
The tree follows max-heap property as every
node is greater than all of its descendants.*/
class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
         for(int i = 0; i < n / 2; i++){
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            
            if(leftChild < n && arr[i] < arr[leftChild]){
                return false;
            }
            
           
            if(rightChild < n && arr[i] < arr[rightChild]){
                return false;
            }
        }
        return true;

    }
}
