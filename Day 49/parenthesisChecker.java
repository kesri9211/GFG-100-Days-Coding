/*Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balanced pairs, with 0 number of 
unbalanced bracket.*/
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character>st=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            switch(ch){
            case '{':
                st.push('}');
                break;
            case '[':
                st.push(']');
                break;
            case '(':
                st.push(')');
                break;
            default:
            if(st.isEmpty() || ch!=st.pop()) return false;
            }
        }
        return st.isEmpty();
    }
}
