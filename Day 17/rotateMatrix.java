/*Given a square matrix of size N x N. The task is to rotate it by 
  90 degrees in anti-clockwise direction without using any extra space. */

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    
//approach:First find reverse of each row and then transpose of that matrix(anticockwise)
//first find transpose and then reverse each rows of transposed matrix(clockwise)
    static void rotateby90(int matrix[][], int n) 
    { 
         //find reverse of each row
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
        //find transpose(in-place)
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
       
    static void reverse(int matrix[]){
        int i=0;
        int j=matrix.length-1;
        while(i<j){
            int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }
    }
}
