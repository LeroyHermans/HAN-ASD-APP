package nl.han.app.Datastructures;

import nl.han.app.Datastructures.Interfaces.IHANStack;
import nl.han.app.Lists.HANLinkedList;

import java.lang.reflect.Array;

public class HANStack<T> implements IHANStack<T> {

    private HANLinkedList<T> stack;

    public HANStack() {
        this.stack = new HANLinkedList<T>();
    }

    public T pop() {
        T temp = stack.get(0);
        stack.removeFirst();
        return temp;
    }

    public void push(T item) {
        stack.addFirst(item);
    }

    public T top() {
        return stack.get(0);
    }

    public int getSize() {
        return stack.getSize();
    }

    @Override
    public String toString() {
        return "ArrayQueue{" + "list = " + stack.toString() + ", Length = " +
                stack.getSize() + "}";
    }
}
