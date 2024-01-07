/*Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.*/

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k)count++;
            }
        }
        return count;
        
    }
//method 2 -->better TC
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
      int count = 0;
      for(int a : arr){
            count+=map.getOrDefault(k-a,0);
            map.put(a,map.getOrDefault(a,0)+1);
      }
      return count;
    }
}
