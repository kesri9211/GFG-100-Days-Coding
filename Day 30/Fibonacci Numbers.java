/*Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.*/
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        
        long ar[]=new long[n];
        ar[0]=1;
        if(n==1) return ar;
        
        ar[1]=1;
        if(n==2) return ar;

        for(int i=2;i<n;i++){
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar;
    }
}
