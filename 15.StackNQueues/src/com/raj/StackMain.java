package com.raj;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);

        stack.push(89);
        stack.push(78);
        stack.push(67);
        stack.push(56);
        stack.push(45);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
