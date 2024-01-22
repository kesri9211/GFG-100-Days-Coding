/*Given a sorted array arr[] of size N. Find the element that appears only once in the array. All other elements appear exactly twice. 

Example 1:

Input:
N = 11
arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65}
Output: 4
Explanation: 4 is the only element that 
appears exactly once.*/
class Solution 
{
    int findOnce(int arr[], int n)
    {

        if(n==0){
            return 0;
        }
        if(n==1){
            return arr[0];
        }
       int i;
        for(i=0;i<n-1;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        if(arr[i]!=arr[i-1]) return arr[i];
        return 0;
    }
}
