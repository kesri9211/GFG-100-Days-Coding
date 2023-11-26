/*Print a sequence of numbers starting with N, without using loop, where replace N with N - 5, until N > 0. After that replace N with N + 5 until N regains its initial value.

Example 1:
Input: 
N = 16
Output: 
16 11 6 1 -4 1 6 11 16
Explaination: 
The value decreases until it is greater than 0. After that it increases and stops when it becomes 16 again.*/

class Solution{
    List<Integer> am(List<Integer> list1,int n,int s){
         list1.add(n);
        if(n==list1.get(0)) return list1;
       
        if(n<=0) s=1;
        if(s==1) return am(list1,n+5,1);
        else return am(list1,n-5,0);
    }
    public List<Integer> pattern(int N){
        List<Integer> lists=new ArrayList<>();
        lists.add(N);
        if(N<=0) return lists;
        return am(lists,N-5,0);
    }
}
