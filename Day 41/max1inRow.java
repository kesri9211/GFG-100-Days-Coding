/*Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.

Example 1:

Input:
N = 3, M = 4
Mat[] = {{0 1 1 1},
         {0 0 1 1},
         {0 0 1 1}}
Output: 0
Explanation: Row 0 has 3 ones whereas
rows 1 and 2 have just 2 ones.*/
class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        int currCount = 0;
        int maxCount = 0;
        int row = 0;
        int i,j;
        for( i = 0; i < N; i++){
            currCount = 0;
            for( j = 0; j < M; j++){
                if(Mat[i][j] == 1)  currCount++;
            }
            if(currCount>maxCount){
                maxCount = currCount;
                row = i;
            }
        }
        
        if(maxCount == 0)   return -1;
        
        return row;
    }
}
