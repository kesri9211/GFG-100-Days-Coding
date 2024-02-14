/*Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.

Example 1:

Input:
L = 6, N = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output: 1
Explanation: (2, 80) have difference of 78.*/
class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        for(int i=0;i<size-1;i++){
            for(int j=size-1;j>i;j--){
                if(arr[j]-arr[i]==n)return true;
            }
        }
        return false;
    }
}
