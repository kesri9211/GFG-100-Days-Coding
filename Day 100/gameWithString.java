/*Given a string s of lowercase alphabets and a number k, the task is to print the minimum value of the string after removal of k characters. 
The value of a string is defined as the sum of squares of the count of each distinct character present in the string. 

Example 1:
Input: 
s = abccc, k = 1
Output: 
6
Explaination:
We remove c to get the value as 12 + 12 + 22*/
//approch: 1,2
class Solution{
    static int minValue(String s, int k){
        // code here
        int freq[]=new int[26];
        //1-freq array of character array
         for(char c:s.toCharArray())freq[c-'a']++;
        //2-define priority queue
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int f:freq)pq.add(f);
        while(k>0){
            int ele=pq.poll();
            //add remaining
            pq.add(ele-1);
            k--;
        }
        int sum=0;
        //calculate remaining sum of freq
        while(!pq.isEmpty()){
            sum+=pq.peek()*pq.poll();
        }
        return sum;
    }
}
