package nl.han.app.Lists;

import nl.han.app.Lists.Interfaces.IGenericArrayList;

public class GenericArrayList<T> implements IGenericArrayList<T> {

    private static final int DEFAULT_LENGTH = 10;
    private Object[] data;
    private int size;

    public GenericArrayList() {
        data = new Object[GenericArrayList.DEFAULT_LENGTH];
        size = 0;
    }

    public void add(T value) {
        if (size < data.length) {
            data[size] = value;
        } else {
            resize();
        }
        ++size;
    }

    public T get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    public void set(int index, T value) {
        if (index < data.length) {
            data[index] = value;
            size = index + 1;
        } else {
            resize(index + 1);
            data[index] = value;
            size = index + 1;
        }
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        copyArray(data, temp);
        data = temp;
    }

    private void resize(int amount) {
        Object[] temp = new Object[amount];
        copyArray(data, temp);
        data = temp;
    }

    private void copyArray(Object[] origional, Object[] target) {
        if (target.length < origional.length) {
            throw new RuntimeException(origional + " Cannot be copied into: " + target);
        }
        for (int i = 0; i < target.length; i++) {
            if (i < origional.length) {
                target[i] = origional[i];
            } else {
                target[i] = null;
            }
        }
    }
}
