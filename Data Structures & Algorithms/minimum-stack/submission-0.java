class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        this.stack.push(val);
        if(this.minStack.peek() != null && this.minStack.peek() >= val){
            this.minStack.push(val);
        } else if(this.minStack.peek() == null){
             this.minStack.push(val);
        }
    }
    
    public void pop() {
        int val = this.stack.peek();
        this.stack.pop();
        if(this.minStack.peek() == val){
            this.minStack.pop();
        }
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        int val = this.minStack.peek();
        return val;
    }
}
