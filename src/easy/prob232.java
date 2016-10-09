package easy;

import java.util.Stack;

public class prob232 {
    
    private Stack<Integer> st = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> tmp = new Stack<Integer>();
        while (!st.isEmpty()) {
            tmp.push(st.pop());
        }
        st.push(x);
        while (!tmp.isEmpty()) {
            st.push(tmp.pop());
        }
    }

    public void pop() {
        // Removes the element from in front of queue.
        st.pop();
    }

    // Get the front element.
    public int peek() {
        return st.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return st.isEmpty();
    }
}
