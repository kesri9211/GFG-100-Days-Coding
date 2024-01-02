/*Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
Example 1:

Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5*/
class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                al.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                al.add(arr[i]);
            }
        }
        
        for(int i=0;i<n;i++){
            arr[i]=al.get(i);
        }
    }
}
