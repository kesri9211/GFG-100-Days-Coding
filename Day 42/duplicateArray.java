/*N = 4
a[] = {0,3,1,2}
Output: 
-1
Explanation: 
There is no repeating element in the array. Therefore output is -1.*/
//approach: prefix sum array
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        //find max value of array
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int freq[]=new int[n];
        ArrayList<Integer>ans=new ArrayList<>();
        //making freq array
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        int f=0;
        //check freq
        for(int i=0;i<n;i++){
            if(freq[i]>1){
                ans.add(i);
                f=1;
            }
        }
        if(f==1) return ans;
        ans.add(-1);
        return ans;
    }
}
