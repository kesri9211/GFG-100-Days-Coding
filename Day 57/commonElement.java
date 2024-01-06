/*Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.*/
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        // int i=0;
        // int j=0;
        // int k=0;
        // ArrayList<Integer>ans=new ArrayList<>();
        // while(i<n1 && j<n2 && k<n3){
        //     if(A[i]<B[j] && A[i]<C[k]) i++;
            
        //     else if(C[k]<A[i] && C[k]<B[j]) k++;
            
        //     else if(B[j]<A[i] && B[j]<C[k]) j++;
            
        //     else if(A[i]==B[j] && B[j]==C[k]){
        //         if(!ans.contains(A[i]))
        //             ans.add(A[i]);
        //         i++;
        //         j++;
        //         k++;
        //     }
        // }
        // return ans;

      //method 2 better TC
        ArrayList<Integer> al = new ArrayList<>();
        
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        
        for(int i=0;i<n1;i++){
            h1.add(A[i]);
        }
        for(int i=0;i<n2;i++){
            //store only those value that are common in A,B->h2
            if(h1.contains(B[i])){
                h2.add(B[i]);
            }
        }
        for(int i=0;i<n3;i++){
            //store only those value that are common in h2,C->common in all three
            if(h2.contains(C[i])){
                //no repeated value should be there
                if(!al.contains(C[i]))
                    al.add(C[i]);
            }
        }
        return al;
    }
}
