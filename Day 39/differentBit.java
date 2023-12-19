/*Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers. If both M and N are the same then return -1 in this case.

Example 1: 

Input: 
M = 11, N = 9
Output: 
2
Explanation: 
Binary representation of the given numbers are: 1011 and 1001, 2nd bit from right is different.*/
class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        ArrayList<Integer> a=binary(m);
        ArrayList<Integer> b=binary(n);
        //System.out.println(a);
        //System.out.println(b);
        int i=0;
        while(i<a.size() && i<b.size()){
            //if same inc index else return index+1
            if(a.get(i)!=b.get(i)) return i+1;
            else
                i++;
        }
        //after this even if size is same it means same number is there so return -1
        //else return index+1 as size is different
        if(a.size()==b.size()) return -1;
        else
            return i+1;
    }
    //funtion to find binary representation and store into arraylist
    public static ArrayList<Integer> binary(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        while(n>1){
            int r=n%2;
            ans.add(r);
            n=n/2;
        }
        ans.add(n);
        return ans;
    }
}
