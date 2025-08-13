package com.raj.questions;

import java.util.Stack;

// Q.921. Minimum Add to Make Parenthesis Valid
public class ValidParenMinAdd {
    public int minAddToMakeValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == ')'){
                if (!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
