/*Input:
N = 7
Arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: 3 7 4 8 2 6 1
Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1 (inspace)
*/
//approach: if index is even check for a[i]<a[i+1] else check for a[i]>a[i+1] if not true then swap
class Solution{
    public void zigZag(int a[], int n){
        // Code your solution here. 
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(a[i]>a[i+1]){
                    //swap
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            else{
                if(a[i]<a[i+1]){
                    //swap
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
    }
}
