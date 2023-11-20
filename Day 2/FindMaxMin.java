//Q: Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        long max=Integer.MIN_VALUE;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        return new Pair(min,max);
    }
}
