package nl.han.app.Lists.Interfaces;

public interface IHANLinkedList<T> {

    void addFirst(T value);

    void removeFirst();

    void insert(int index, T value);

    void delete(int index);

    T get(int index);
}
