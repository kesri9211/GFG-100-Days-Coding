/*Given an array of n integers. Find the minimum non-negative number to be inserted in array, so that sum of all elements of array becomes prime.
Example 1:

Input:
N=5
arr = {2, 4, 6, 8, 12}
Output:  
5
Explanation: 
The sum of the array is 32 ,we can add 5 to this to make it 37 which is a prime number.*/
class Solution
{
    public int minNumber(int arr[], int N)
    {
        //find sum 
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        //if sum is 1 add 1
        if(sum==1)return 1;
        //if already prime
         if(prime(sum)) return 0;
         else{
             //find new smaller element
             int ans=0;
             for(int i=1;i<sum;i++){
                 if(prime(sum+i)){
                     ans=i;
                     break;
                 }
             }
             return ans;
         }
    }
    //function to check prime
    static boolean prime(int sum){
        int i=2;
        while(i<=Math.sqrt(sum)){
            if(sum%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
