//Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		 //return (long) Math.sqrt(x);
		 
		  // use binary search
        if(x == 0 || x == 1){
            return x;
        }
        long start = 1, end = x/2, res = 0;
        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid*mid == x){
                return (int) mid;
            }
            if(mid*mid < x){
                start = mid+1;
                res = mid;
            }
            else{
                end = mid - 1;
            }
        }
        return (int) res;
	 }
}
