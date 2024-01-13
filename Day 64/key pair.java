/*Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:
Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
  */
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> a = new HashSet<Integer>();
        
        for(int i=0; i<n; i++){
            int m = x-arr[i];
            if(a.contains(m)){
                return true;
            }else{
                a.add(arr[i]);
            }
        }
        
        return false;
    }
}
