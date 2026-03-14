class MinStack {
    Stack<Integer> s=new Stack<>();// to store all values as is
    Stack<Integer> minStack=new Stack<>();// to store minimum value
    public MinStack() {
    }
    
    public void push(int val) 
    {
        s.push(val);

        if(minStack.isEmpty() || val <= minStack.peek())
        {
            minStack.push(val);   //store such that minimum value is always at top                    
        }
    }
    
    public void pop() 
    {
        if(s.peek().equals(minStack.peek()))
        {
            minStack.pop();// if minimum value is at top and same as other stack, then pop so we can have the next minimum value in the stack
        }
        s.pop();
    }
    
    public int top() 
    {
        return s.peek();
    }
    
    public int getMin() 
    {
        return minStack.peek();// return minimum value of our stack
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */