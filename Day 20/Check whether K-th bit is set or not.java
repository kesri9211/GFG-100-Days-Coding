/*Given a number N and a bit number K, check if Kth index bit of N is set or not. A bit is called set if it is 1. 
Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.
Note: Index is starting from 0. You just need to return true or false, driver code will take care of printing "Yes" and "No".

Example 1:

Input: 
N = 4
K = 0
Output: 
No
Explanation: 
Binary representation of 4 is 100, in which 0th index bit from LSB is not set. So, return false.
*/
//approach:store binary representaion into arrayList and then find requried index

class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        ArrayList<Integer>ar=new ArrayList<>();
        while(n>0){
            int r=n%2;
            ar.add(r);
            n=n/2;
        }
       // System.out.println(ar);
        //LSB(reverse of binary represent)==index of arraylist
        if(ar.size()-1>=k && ar.get(k)==1)
            return true;
        else return false;
    }
    
}
