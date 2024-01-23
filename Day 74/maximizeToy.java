class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        int count=0;
        int i=0;
        Arrays.sort(arr);
        while(i<N && K>0){
            if(arr[i]<=K){
                count++;
                K=K-arr[i];
            }
            i++;
        }
        return count;
    }
}
