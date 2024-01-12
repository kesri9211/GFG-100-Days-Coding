/*Given an array arr[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all numbers from 1 to N. Make in-place changes in arr[], such that arr[i] = frequency(i). Assume 1-based indexing.
Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place. 

Example 1:

Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1*/

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // Approach: create frequency array
        int freq[]=new int[N+1];
        for(int i=0;i<N;i++){
            if(arr[i]<=N)//count freq only when array element is less than size of array
                freq[arr[i]]++;
        }
        for(int i=0;i<N;i++){
            //1-based index
            arr[i]=freq[i+1];
        }
    }
}
