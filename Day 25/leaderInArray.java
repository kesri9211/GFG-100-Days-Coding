/*Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than 
  or equal to all the elements to its right side. The rightmost element is always a leader. */

//approach: 2 pointer
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer>al=new ArrayList<>();
        //starting index i
        for(int i=0;i<n;i++){
            int flag=1;
        //pointer to compare all right side element of i 
            for(int j=n-1;j>i;j--){
        //if any number in right side of i is greator that mean ith num is not greatest
                if(arr[j]>arr[i]) {
                    flag=0;
                    break;
                }
            //add to linked list
            if(flag==1) al.add(arr[i]);
        }
        return al;
    }
}
