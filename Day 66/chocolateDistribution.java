/*Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet.
Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets
among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:
Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.*/

//Approach: sort then find difference between find and last element of that range(m)->The difference
//between maximum number of chocolates given to a student and minimum number of chocolates given to a student
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int i=m;
        int j=0;
        int min=Integer.MAX_VALUE;
        while(i<=n){
         if((a.get(i-1)-a.get(j))<min)
            min=a.get(i-1)-a.get(j);
         i++; j++;
        }
    return min;
    }
}
