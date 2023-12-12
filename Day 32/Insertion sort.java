//approach: two part of array one is sorted and another is unsorted put all the element in sorted part of array at by comparing 
class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++){
          int j=i;
          while(j>0 && arr[j]<arr[j-1]){
              //swap
              int temp=arr[j];
              arr[j]=arr[j-1];
              arr[j-1]=temp;
              j--;
          }
      }
  }
}
