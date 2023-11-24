/*Given a positive integer N, return the Nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.
The elements can be large so return it modulo 109 + 7.*/

//approach: sum of upper two
class Solution {
    //The elements can be large so return it modulo 10^9 + 7.
    long mod = 1000000007;
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        long ar[][]=new long[n][];
        ArrayList<Long>l=new ArrayList<>();
        int i=0;
        for(i=0;i<n;i++){
            //(i)th row has (i+1)th column
            ar[i]=new long[i+1];
            //first and last element is always 1
            ar[i][0]=ar[i][i]=1l;
            for(int j=1;j<i;j++){
                ar[i][j]=(ar[i-1][j-1]+ar[i-1][j])%mod;
            }
        }
        for(int j=0;j<n;j++){
            l.add(ar[i-1][j]);
        }
        return l;
    }
}
