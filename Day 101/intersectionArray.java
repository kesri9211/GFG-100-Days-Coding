/*Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of elements in the intersection (or common elements) of the two arrays.

For this question, the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

Example 1:

Input:
n = 5, m = 3
a[] = {89, 24, 75, 11, 23}
b[] = {89, 2, 4}

Output: 1

Explanation: 
89 is the only element 
in the intersection of two arrays.
*/
class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
//some test case are failing
        // Arrays.sort(a);
        // Arrays.sort(b);
        // int i=0,j=0,count=0;
        // while(i<n && j<m){
        //     if(a[i]<b[j]) i++;
        //     else if(b[j]<a[i]) j++;
        //     else if(a[i]==b[j]){
        //         i++;
        //         j++;
        //         count++;
        //     }
        // }
        // return count;
        
        
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for(int i:a){
            hs.add(i);
        }
        for(int i:b){
            if(hs.contains(i)){
                count++;
                hs.remove(i);
            }
        }
        return count;
    }
};
