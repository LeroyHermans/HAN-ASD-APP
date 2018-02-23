package nl.han.app.Datastructures.Interfaces;

public interface IStack<T> {

    /**
     * Pop the first item off the stack.
     * @return The first item of the stack.
     */
    T pop();

    void push(T item);
    T peek();
    boolean isEmpty();
    boolean isFull();
}
