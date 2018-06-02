package nl.han.app.Lists.Interfaces;

public interface IGenericArrayList<T> {
    void add(T value);

    T get(int index);

    void set(int index, T value);
}
