package org.example;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.length() == 1 && !Character.isDigit(token.charAt(0))) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case ("+"): {
                        stack.add(a + b);
                        break;
                    }
                    case ("-"): {
                        stack.add(a - b);
                        break;
                    }
                    case ("*"): {
                        stack.add(a * b);
                        break;
                    }
                    case ("/"): {
                        stack.add(a / b);
                        break;
                    }
                }
            } else {
                stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    // ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
    // stack: 10 6 -132

    public static void main(String[] args) {

    }
}