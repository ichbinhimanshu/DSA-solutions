class MinStack {
    public Stack<Integer> st;
    public Stack<Integer> min;

    public MinStack() {
        st=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int value) {
        if(st.size()==0 || value<=min.peek()){
            min.push(value);
        }
        st.push(value);
    }
    
    public void pop() {
        if(st.peek().equals(min.peek())){     //give error in == so use isequal
            min.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */