package InBuiltExamples;

import java.util.Stack;

public class CustomStack {

    protected int[] data;  // stack as an array , it is protected as no one can change
    private static final int Default_Size = 10;  // default size of array that no can change
     int ptr = -1;  // a pointer to index value set as -1 , to get access of the current index of array

    // here we have tagged it as final as no one can
    // change , it is the size of the array when default constructor is called
    // now when ever we will call the constructor it should create an array

    public CustomStack(){
        this(Default_Size);
        // it will call the constructor with one parameter and create and stack array of size of default_Size
    }

    public CustomStack(int size){
        this.data = new int[size]; // creating an array of length size
    }

    public void push(int value){
        if( isFull() ){
            System.out.println("Stack is Full");
            return;
        }

        ptr++;
        data[ptr] = value;
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }

    // Exception Handling throws comes next to the function
    // here stackExceptions is a child class that extends to the parent class Exception
    public int pop() throws StackExceptions{
        if( isEmpty() ){
            // here our program will show an exception
            // it will call to our custom stack exception method
            throw new StackExceptions("Cannot pop from an empty stack");
        }
        int val = data[ptr];
        data[ptr--] = 0;
        return val;
    }

    public int peek() throws StackExceptions{

        if (isEmpty()) {
            throw new StackExceptions("Cannot get peek from an empty stack ");
        }

        return data[ptr];
    }

    public static void main(String[] args) throws StackExceptions {
//
//        CustomStack stack = new CustomStack(5);
//        stack.push(5);
//        stack.push(4);
//        stack.push(87);
//        stack.push(56);
//        stack.push(41);
//
//        for(int i = 0; i < 5; i ++){
//        System.out.println(stack.pop());}
//        stack.peek();

        DynamicStack stack = new DynamicStack(1);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        stack.push(24);
        System.out.println(stack.pop());



    }
}
