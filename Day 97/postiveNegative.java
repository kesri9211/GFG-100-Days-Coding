/*Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a positive element.
 

Example 1:

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation : Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 9,-2,4,-1,5,-5,0,-3,2.
*/
class Solution {
    void rearrange(int arr[], int n) {
        // code here
     //TC- exceeded
        // ArrayList<Integer>positive=new ArrayList<>();
        // ArrayList<Integer>negative=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(arr[i]>=0) positive.add(arr[i]);
        //     else negative.add(arr[i]);
        // }
        // int p=0,ne=0;
        // for(int i=0;i<n;){
        //     if(p<positive.size())
        //         arr[i++]=positive.get(p++);
        //     if(ne<negative.size())
        //         arr[i++]=negative.get(ne++);
        // }
        
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                al2.add(arr[i]);
            }
            else{
                al1.add(arr[i]);
            }
        }
        
        int p1=0;
        int p2=0;
        int p3=0;
        
        for(int i=0;i<n;i++){
            if(i<al1.size()){
                arr[p1++]=al1.get(p2++);
            }
            if(i<al2.size()){
                arr[p1++]=al2.get(p3++);
    }
}
}
}
