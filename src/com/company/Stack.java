package com.company;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }


    public void push(int x)    {
        if (isFull())        {
            System.out.println("Stack is Full");
            System.exit(1);
        }

        System.out.println(x + " is Succesfully Inserted Into The Stack");
        arr[++top] = x;
    }


    public int pop() {

        if (isEmpty())        {
            System.out.println("The Stack is Empty, Boss.");
            System.exit(1);
        }

        System.out.println(peek() + "Successfully Removed From The Stack");

        return arr[top--];
    }

    public int peek()    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(1);
        }

        return -1;
    }

    public int size() {
        return top + 1;
    }


    public Boolean isEmpty(){
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }
}
