/*Since the answer can be very large, answer modulo 109+7 should be printed.

Example 1:
Input:
n = 3
Linked List = {0, 1, 1}
Output:
3
Explanation:
0*22 + 1*21 + 1*20 =  1 + 2 + 0 = 3*/
class Solution
{
   long DecimalValue(Node head)
   {
       
 	long mod=(long) 1e9+7;
 	long decimal_val=0;
 	if (head==null)return decimal_val;
 	
//  	Node temp=head;
//  	int c=-1;
//  	while(temp!=null){
//  	    c++;
//  	    temp=temp.next;
//  	}
 	while(head!=null){
 	    decimal_val=(decimal_val*2+head.data)%mod;

 	    head=head.next;
 	   
 	}
 	return decimal_val;
   }
}
