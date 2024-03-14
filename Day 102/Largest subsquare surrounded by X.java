/*Given a square matrix a of size n x n, where each cell can be either 'X' or 'O', you need to find the size of 
the largest square subgrid that is completely surrounded by 'X'. More formally you need to find the largest square within the
grid where all its border cells are 'X'.

Example 1:

Input:
n = 2
a = [[X,X],
     [X,X]]
Output:
2
Explanation:
The largest square submatrix 
surrounded by X is the whole 
input matrix.
*/
class Solution {
    int largestSubsquare(int n, char a[][]) {
        // code here
        //make seperate row and col matrix
        int rowMat[][]=new int[n][n];
        int colMat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            int row=0,col=0;
            for(int j=0;j<n;j++){
                if(a[i][j]=='X') row++;
                else row=0;
                
                if(a[j][i]=='X') col++;
                else col=0;
                
                rowMat[i][j]=row;
                colMat[j][i]=col;
            }
        }
        //find minimum of row and col matrix and then move in that direction and compare
        int res=0;
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int s=Math.min(rowMat[i][j],colMat[i][j]);
                while(s>res){
                    if(s<=rowMat[i-s+1][j] && s<=colMat[i][j-s+1]) res=s;
                    else s--;
                }
            }
        }
        return res;
    }
};
