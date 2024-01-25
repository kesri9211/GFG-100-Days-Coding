/*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.*/
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // TC=O(n*n)
        // long max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //   long sum=0;
        // //   max=arr[i];
        //     for(int j=i;j<n;j++){
        //         sum=sum+arr[j];
        //         max=Math.max(max,sum);
        //     }
            
        // }
        // return max;
        
        //kadane's algo TC=O(n)
        long max=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
