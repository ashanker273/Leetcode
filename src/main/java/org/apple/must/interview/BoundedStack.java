package org.apple.must.interview;

import java.util.Stack;

public class BoundedStack {
    private int capacity;
    private Stack<Integer> stack = new Stack<>();

    public BoundedStack() {
        stack.push(-1);
        this.capacity = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Stack<Integer> getStack() {
        return stack;
    }

    public void setStack(Stack<Integer> stack) {
        this.stack = stack;
    }

    public boolean push(int x) {
        if(stack.size() <= capacity) {
            stack.push(x);
            return true;
        }
        else {
            System.out.println("Stack is full please pop()");
            return false;
        }
    }

    public int pop() {
        if(stack.peek() != -1) {
            return stack.pop();
        }
        else {
            System.out.println("Stack is full please push()");
            return -1;
        }
    }

    public static void main(String[] args) {
        BoundedStack boundedStack = new BoundedStack();
        boundedStack.setCapacity(3);
        boundedStack.push(1);
        boundedStack.push(2);
        boundedStack.push(3);
        boundedStack.push(4);
        boundedStack.push(5);
        System.out.println(boundedStack.pop());
        System.out.println(boundedStack.pop());
        System.out.println(boundedStack.pop());
        System.out.println(boundedStack.pop());
        System.out.println(boundedStack.pop());
        System.out.println(boundedStack.pop());
        System.out.println(boundedStack.pop());

    }


}
