class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(output.isEmpty())return -1;
	    return output.pop();
	    
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here
	    //empty 'output' and put all element into 'input'
	    while(!output.isEmpty()){
	        input.push(output.pop());
	    }
	    //push last element in empty stack--->act as queue
	    output.push(x);
	    //again push back element from 'input' to 'output'
	    while(!input.isEmpty()){
	        output.push(input.pop());
	    }
    }
}
