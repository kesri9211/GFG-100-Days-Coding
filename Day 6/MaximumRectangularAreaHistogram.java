/*Find the largest rectangular area possible in a given histogram where the largest rectangle can 
  be made of a number of contiguous bars. For simplicity, assume that all bars have the same width and
  the width is 1 unit, there will be N bars height of each bar will be given by the array arr.*/
class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        //next smaller index of every element(nsi[])
        //previous smaller index of every element(psi[])
        //area=(nsi[]-psi[]-1)*hist[]
        
        //next smaller index
        Stack<Integer>st=new Stack<>();
        long nsi[]=new long[hist.length];
        nsi[hist.length-1]=hist.length; //store index of next smaller element
        st.push(hist.length-1); //push index current element for comparison
        for(int i=hist.length-2;i>=0;i--){
            while(!st.isEmpty() && hist[i]<=hist[st.peek()]){
                st.pop();
            }
            if(st.size()==0) nsi[i]=hist.length;
            else nsi[i]=st.peek();
            st.push(i);
        }
        
        //empty stack
        while(st.size()!=0)
         st.pop();
        
        //previous smaller index
        long psi[]=new long[hist.length];
        psi[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && hist[i]<=hist[st.peek()]){
                st.pop();
            }
            if(st.size()==0) psi[i]=-1;
            else psi[i]=st.peek();
            st.push(i);
        }
        //find max area
        long max=0;
        for(int i=0;i<n;i++){
            long area=(nsi[i]-psi[i]-1)*hist[i];
            if(area>max)
                max=area;
        }
        return max;
    }
        
}
