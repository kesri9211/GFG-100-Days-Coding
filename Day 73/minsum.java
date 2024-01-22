/*You are given two arrays, A and B, of equal size N. The task is to find the minimum value of A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1], where shuffling of elements of arrays A and B is allowed.


Example 1:

Input:
N = 3 
A[] = {3, 1, 1}
B[] = {6, 5, 4}
Output:
23 
Explanation:
1*6+1*5+3*4 = 6+5+12
= 23 is the minimum sum*/
//approach: sort array in accending and decending order and calculate sum of mul
class Solution {

    public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        long sum=0;
        Arrays.sort(a);
        Arrays.sort(b);
        int l=0;
        int r=(int)n-1;
        while(l<r){
            int temp=(int)b[l];
            b[l]=(int)b[r];
            b[r]=temp;
            l++;r--;
        } 
        for(int i=0;i<n;i++){
            sum+=a[i]*b[i];
        }
        return sum;
    }
}
