package nl.han.app.ArrayList.Interfaces;

public interface IGenericArrayList<T> {
    void add(T value);

    T get(int index);

    void set(int index, T value);
}
