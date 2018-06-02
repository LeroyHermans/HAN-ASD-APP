package nl.han.app.Datastructures.Interfaces;

public interface IHANQueue<T> {

    void makeEmpty();

    void enQueue(T item);

    T deQueue();
}
