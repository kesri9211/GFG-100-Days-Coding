/*Given two integers L, R, and digit X. Find the number of occurrences of X in all the numbers in the range (L, R) excluding L and R.

Example 1:

Input:
L=10, R=19, X=1
Output:
9
Explanation:
There are 9 1s (11, 12, 13, 14, 15, 16, 17, 18) in the numbers in the range (10,19).*/
class Solution {
    int countX(int L, int R, int X) {
        // code here
        // int count =0;
        // for(int i=L+1;i<R;i++){
        //     while(i>0){
        //         if(i%10==X){
        //             count ++;
        //         }
        //         i=i/10;
        //     }
        // }
        // return count;
    
    
        int n=L+1;
        int count=0;
        //traverse from L to R
        while(n<R){
            //counter funtion to count number of 'X' in each n
            count+=counter(n,X);
            n++;
        }
        return count;
    }
    int counter(int n,int X){
        int count=0;
        while(n>0){
            if(n%10==X) count++;
            n=n/10;
        }
        return count;
    }
};
