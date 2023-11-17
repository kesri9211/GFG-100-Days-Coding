/*Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.
Example 1:
Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 */

class Solution
{
    //Function to find maximum of each subarray of size k.
    public static int max(int ar[],int i,int j){
            int ans=Integer.MIN_VALUE;
            for(int a=i;a<=j;a++){
                if(ar[a]>ans)
                    ans=ar[a];
            }
            return ans;
        }
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            int j=i+k-1;
            list.add(max(arr,i,j));
            
        }
        return list;
    }
}
