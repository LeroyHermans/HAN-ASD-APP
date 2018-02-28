package nl.han.app.Lists.Interfaces;


import java.util.Collection;

public interface IHANQueue<T> {

    void makeEmpty();

    void enQueue(T item);

    T deQueue();
}
