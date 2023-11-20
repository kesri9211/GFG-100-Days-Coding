//Q:Given a 2D matrix M of dimensions RxC. Find the maximum sum submatrix in it.
//approach: calculate sum of columns(c0-c1,c0-c2,c0-c3...simlarly c1-c2,c1-c3..) and then find max using kadane algorithm
class Solution {
    // Function to find the maximum sum rectangle in a 2D matrix
    int maximumSumRectangle(int R, int C, int M[][]) {
        // Array to store the sum of elements in each row
        int sum[] = new int[R];
        // Variable to store the maximum sum of rectangle
        int maxSum = Integer.MIN_VALUE;

        // Iterate over all possible starting columns
        for(int cStart = 0; cStart < C; cStart++) {
            // Reset the sum array for each new starting column
            Arrays.fill(sum, 0);

            // Iterate over all possible ending columns
            for(int cEnd = cStart; cEnd < C; cEnd++) {
                // Update the sum array by adding elements in the current column
                for(int row = 0; row < R; row++) {
                    sum[row] += M[row][cEnd];
                }

                // Find the maximum sum subarray in the current sum array using Kadane's algorithm
                int curMaxSum = kadans(sum);

                // Update the maximum sum if the current sum is greater
                maxSum = Math.max(maxSum, curMaxSum);
            }
        }
        // Return the maximum sum of the rectangle
        return maxSum;
    }

    // Kadane's algorithm to find the maximum sum subarray in a 1D array
    int kadans(int a[]) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        // Iterate over each element in the array
        for (int i = 0; i < size; i++) {
            // Update the maximum ending here by adding the current element
            max_ending_here = max_ending_here + a[i];
            
            // If the maximum so far is less than the maximum ending here, update it
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;

            // If the maximum ending here becomes negative, reset it to 0
            if (max_ending_here < 0)
                max_ending_here = 0;
        }

        // Return the maximum sum subarray
        return max_so_far;
    }
};
