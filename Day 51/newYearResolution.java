/*Earning Coin: Geek can accumulate coins[i] by solving the POTD on the ith day, where 1 <= coins[i] <= 2024 and the sum of coins <= 2024.
Merchandise Eligibility: To purchase merchandise, the coins earned must be divisible by 20 or 24, or precisely equal to 2024.
Geek's resolutions often fades over time. Realistically, he can only commit to active participation for N (where N ≤ 366) days. Given the value of N and number of coins associated with each POTD, can Geek strategically solve some (or all) POTDs to become eligible for redeeming merchandise?

Example 1:

Input:
N = 8
coins = [5, 8, 9, 10, 14, 2, 3, 5]

Output: 1

Explanation:
Geek can fulfill the criteria in many ways.
One such way is to solve POTD on 4th and 5th day.
Another way is to solve POTD on 1st, 4th and 8th day.*/

class Solution {
    public static boolean isPossible(int N, int[] coins) {
        // code here
        return find(0,0,coins);
    }
    static boolean find(int ind,int sum,int[]coins){
        //give condition
        if(sum>0 && (sum%24==0 || sum%20==0 || sum==2024)) return true;
        if(ind>=coins.length)return false;
        
        return find(ind+1,sum+coins[ind],coins)|| find(ind+1,sum,coins);
    }
}
