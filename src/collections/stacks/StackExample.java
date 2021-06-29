package collections.stacks;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //ArrayList aray = new List
        //Queue
        //Stacks

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        //push present in Stack class
        //add comes from parent List interface

        //open          30 20 10 //closed

        System.out.println(stack.pop());

        System.out.println( stack.peek());

        System.out.println(stack);
        System.out.println(stack.get(0));

    }
}
