/*Given an array arr of size N and an element k. The task is to find the count of elements in the array that appear more than n/k times.

Example 1:

Input:
N = 8
arr = [3,1,2,2,1,2,3,3]
k = 4
Output: 
2
Explanation: 
In the given array, 3 and 2 are the only elements that appears more than n/k times.*/
class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {

//Approach: 2 pointer
        Arrays.sort(arr);
        int i=0;
        int j=1;
        int d=n/k;
        int freq=0;
        int ans =0;
        while(i<n && j<n){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                freq=j-i; //to get freq of element 
                i=j;  //move i to j
                if(freq>d){ //if freq > n/k 
                    ans++;
                }
            }
        }
        //for last digit
        freq=j-i;
        i=j;
        if(freq>d){
             ans++;
        }
        return ans;
    }
}
