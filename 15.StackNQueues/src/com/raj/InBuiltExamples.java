package com.raj;

import java.util.*;

public class InBuiltExamples {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(4);
        stack.push(7);
        stack.push(56);
        stack.push(45);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(78);
        queue.add(45);
        queue.add(13);
        queue.add(34);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(89);
        deque.removeLast();
        // etc etc
    }
}
