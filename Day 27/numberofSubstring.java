//User function Template for Jav
/*Given an array of N elements and L and R, print the number of sub-arrays such that the value of the maximum array element in that subarray is at least L and at most R.

Example 1:
Input : 
Arr = {2, 0, 11, 3, 0}
L = 1 and R = 10
Output : 
4
Explanation:
The sub-arrays {2}, {2, 0}, {3} and {3, 0} have maximum in range 1-10.

/*approach: 2 pointer
    substring can atleast L and atmost R
    total number of substring = end-start
    if(arr[i])>R cannot include 
    if(arr[i])<L can include in subarray but cannot create subarray
    if (arr[i])>L and arr[i]<R can include*/
class Solution{
    
    static long countSubarrays(int a[], int n, int L, int R)  
    { 
        int start=-1;
        int end=-1;
        long count=0;
        for(int i=0;i<n;i++){
            if(a[i]>R){
                start=i;
                end=i;
                continue;
            }
            if(a[i]>=L){
                end=i;
            }
            //if(arr[i]<=R && arr[i]>=L)
             /*we can include it in existing subarray and can also make a 
             subarray with this value
             end = i */
             count+=end-start;
            
        }
        return count;
        
    } 
}
