class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    //empty q1 and put all values of q1 to q2
	    while(!q1.isEmpty()){
	        q2.offer(q1.poll());
	    }
	    //add new value(at beginning)
	    q1.offer(a);
	    //empty q2 and put all values of q2 to q1-->act as stack
	    while(!q2.isEmpty()){
	        q1.offer(q2.poll());
	    }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    while(q1.isEmpty()){
	        return -1;
	    }
	    return q1.poll();
	    
    }
	
}
