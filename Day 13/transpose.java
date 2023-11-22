/*Complete the function transpose() which takes matrix[][] and N as input parameter and finds the transpose of the input matrix. 
  You need to do this in-place. That is you need to update the original matrix with the transpose. */
//approach: swap upper diagonal matrix
class Solution
{
    public void transpose(int n,int a[][])
    {
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
}
