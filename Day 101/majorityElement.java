/*Given an array A of N elements. Find the majority element in the array. A majority element in 
an array A of size N is an element that appears strictly more than N/2 times in the array.
 */
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int max=0;
        for(int i:a)
            max=Math.max(max,i);
        int freq[]=new int [max+1];
        
        for(int i:a){
            freq[i]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>size/2) return i;
        }
        return -1;
    }
}
