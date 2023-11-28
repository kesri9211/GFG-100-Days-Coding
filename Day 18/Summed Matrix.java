/*A matrix is constructed of size n*n. such that Mi,j= i+j. Count the number of cells having value q.
Note: Assume, the array is in 1-based indexing.
Input:
n = 4, q = 7
Output:
2
Explanation:
Matrix becomes
2 3 4 5 
3 4 5 6 
4 5 6 7
5 6 7 8
The count of 7 is 2.
*/
class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        // long count=0;
        // long ar[][]=new long[n][n];
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         ar[i][j]=i+j;
        //         if(i+j==q)
        //             c++;
        //     }
        // }
        // return c;
        //maximum number in matrix is 2*n
        if(q > 2*n) return 0;
        long x = (2 + 2*n)/2;
        return n-Math.abs(x - q);
    }
};
