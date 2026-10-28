package Stack;

import com.sun.security.jgss.GSSUtil;

import java.util.Stack;

public class Stack_Implementation {
    public static void main(String[] args) {
//        Stack<Integer> stack1 = new Stack<>();
//        stack1.push(1);
//        stack1.push(2);
//        stack1.push(3);
//        System.out.println("Top Element is " + stack1.peek()); // to print top index
//        System.out.println(stack1.get(2)); // to print a specific index
//        System.out.println("Removed " + stack1.pop()); // to remove form top
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.size());
//        if (stack1.isEmpty()){
//            System.out.println("Stack is empty");
//        }
        Stack1 s1 = new Stack1();
        s1.push(5);
        s1.push(6);
        s1.push(7);
        System.out.println("Removed " + s1.pop());
        s1.show();

    }
}

class Stack1{
    int[] stack = new int[5];
    int top = 0;
    int size;
    public void push(int data){
        stack[top] = data;
        top++;
        size++;
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public void show(){
        for (int i = 0; i < size; i++) {
            System.out.println(stack[i]);
        }
    }
}


