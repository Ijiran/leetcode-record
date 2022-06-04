package top.pxyz.simple.s155;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

    Deque<Integer> stack;
    Deque<Integer> min;

    public MinStack() {
        stack = new LinkedList<>();
        min = new LinkedList<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        min.push(Math.min(min.peek(), x));
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
