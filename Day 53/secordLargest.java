class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        Arrays.sort(arr);
        int max=arr[n-1];
        for(int i=0;i<n;i++){
            if(max==arr[i])
                arr[i]=-1;
        }
        //System.out.println( Arrays.toString(arr));
        max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
