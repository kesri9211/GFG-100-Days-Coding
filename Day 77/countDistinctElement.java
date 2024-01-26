/*Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.

Example 1:

Input:
N = 7, K = 4
A[] = {1,2,1,3,4,2,3}
Output: 3 4 4 3
Explanation: Window 1 of size k = 4 is
1 2 1 3. Number of distinct elements in
this window are 3. */

// class Solution
// {
//     ArrayList<Integer> countDistinct(int A[], int n, int k)
//     {
//         // code here 
//         HashSet<Integer>hs=new HashSet<>();
//         ArrayList<Integer>ll=new ArrayList<>();
//         for(int i=0;i<=n-k;i++){
//             int t=k;
//             int j=i;
//             while(t-->0){
//                 hs.add(A[j++]);
//             }
//             ll.add(hs.size());
//             hs.clear();
//         }
//         return ll;
//     }
// }

/*
To achieve a time complexity of O(n) for this problem, you can use a 
sliding window approach. Maintain a HashMap to keep track of the count 
of elements within the current window. When the window slides, update 
the counts accordingly.*/

class Solution {
    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Initialize counts for the first window
        for (int i = 0; i < k; i++) {
            countMap.put(A[i], countMap.getOrDefault(A[i], 0) + 1);
        }

        // Add count of distinct elements for the first window
        result.add(countMap.size());

        // Process the rest of the windows
        for (int i = k; i < n; i++) {
            // Remove the element going out of the window
            if (countMap.get(A[i - k]) == 1) {
                countMap.remove(A[i - k]);
            } else {
                countMap.put(A[i - k], countMap.get(A[i - k]) - 1);
            }

            // Add the new element entering the window
            countMap.put(A[i], countMap.getOrDefault(A[i], 0) + 1);

            // Add count of distinct elements for the current window
            result.add(countMap.size());
        }

        return result;
    }
}
