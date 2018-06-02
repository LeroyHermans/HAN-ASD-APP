package nl.han.app.Datastructures.Interfaces;

public interface IHANStack<T> {

    /**
     * Pop the first item off the stack.
     *
     * @return The first item of the stack.
     */
    T pop();

    void push(T item);

    T top();

    int getSize();
}
