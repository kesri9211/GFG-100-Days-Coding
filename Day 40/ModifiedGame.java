/*You are given an array A of n elements. There are two players player 1 and player 2.
A player can choose any of element from an array and remove it. If the bitwise XOR of all remaining elements equals 0 after removal of the selected element, then that player loses. Find out the winner if player 1 starts the game and they both play their best. 

Example 1:

Input: 
n = 3
A = [3, 3, 2]
Output: 
2
Explaination: 
Optimal removal of values are 3, 2, 3 sequentially. Then the array is empty. So player 2 wins.*/
class Solution{
    static int findWinner(int n, int A[]){
        // code here
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor ^= A[i];
        }
        
        if(xor == 0){
            return 1;
        }
        else{
            return (n % 2) + 1;
        }
    }
}
