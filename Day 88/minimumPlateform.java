/*Given arrival and departure times of all trains that reach a railway station. 
Find the minimum number of platforms required for the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never
be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, 
same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.

Example 1:

Input: n = 6 
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
Output: 3
Explanation: 
Minimum 3 platforms are required to 
safely arrive and depart all trains.*/

//approach: 2-pointer
class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,plateform=1,res=1;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                plateform++;
                i++;
            }
            else if(arr[i]>dep[j]){
                j++;
                plateform--;
            }
            res=Math.max(plateform,res);
        }
        return res;
    }
}
