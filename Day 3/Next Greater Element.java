/*Given an array arr[ ] of size N having elements, the task is to find the
  next greater element for each element of the array in order of their appearance in the array.*/
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long>st=new Stack<>();
        st.push(arr[n-1]);
        long res[]=new long[n];
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0)
                res[i]=-1;
            else
                res[i]=st.peek();
            st.push(arr[i]);
        }
        return res;
    } 
}
