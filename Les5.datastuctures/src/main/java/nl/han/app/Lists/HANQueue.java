package nl.han.app.Lists;

import nl.han.app.Lists.Interfaces.IGenericArrayList;
import nl.han.app.Lists.Interfaces.IHANQueue;

public class HANQueue<T> implements IHANQueue<T> {

    private IGenericArrayList<T> queue = new GenericArrayList<T>();

    public void makeEmpty() {

    }

    public void enQueue(T item) {

    }

    public T deQueue() {
        return null;
    }
}
