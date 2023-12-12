/*Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
NOTE*: A subarray is a contiguous part of any given array.
Example 1:

Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.*/
//User function Template for Java
//approach: prefix sum
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum=0;
        for(int i=0;i<K;i++) sum+=Arr.get(i);
        long curr=sum;
        for(int i=K;i<N;i++) sum=Math.max(sum,curr+=Arr.get(i)-Arr.get(i-K));
        return sum;
    }
}
