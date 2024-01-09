/*N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated
by 2 elements, it becomes 3 4 5 1 2.*/
class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n; //when d>n
        int ans[]=new int[n];
        int j=0;
        for(int i=d;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<d;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
}
        
        //m2 without using extra space
        d=d%n;
        reverse(0,d-1,arr);
        reverse(d,n-1,arr);
        reverse(0,n-1,arr);
    }
    static void reverse(int l,int r,int arr[]){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
