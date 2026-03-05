class MinStack {
    int[] arr = new int[40000];
    int top;
    int min;
    public MinStack() {
        top = -1;
        min = Integer.MAX_VALUE;
    }
    public void push(int val) {
        arr[++top] = val;
        if(val < min){min = val;}
    }
    public void pop() {
        if(top == -1) return;
        int temp = arr[top--];
        if(temp == min){
            min = Integer.MAX_VALUE;
            for(int i = 0; i <= top; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
        }
    }
    public int top() {
        return arr[top];
    }
    public int getMin() {
        return min;

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