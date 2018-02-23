package nl.han.app.Datastructures;

import nl.han.app.Datastructures.Interfaces.IStack;

import java.lang.reflect.Array;

public class Stack<T> implements IStack<T>{

    private int maxSize;
    private int top;
    private T[] stack;

    public Stack(int size, Class<T> c){
        this.maxSize = size;
        //noinspection unchecked
        this.stack = (T[]) Array.newInstance(c, maxSize);
        top = -1;
    }

    public T pop() {
        return stack[top--];
    }

    public void push(T item) {
        stack[++top] = item;
    }

    public T peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
