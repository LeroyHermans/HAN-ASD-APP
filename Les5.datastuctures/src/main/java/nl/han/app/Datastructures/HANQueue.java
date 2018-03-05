package nl.han.app.Datastructures;

import nl.han.app.Datastructures.Interfaces.IHANQueue;

import java.util.ArrayList;
import java.util.List;

public class HANQueue<T> implements IHANQueue<T> {

    private List<T> queue = new ArrayList<T>();

    public void makeEmpty() {
        queue.clear();
    }

    public void enQueue(T item) {
        queue.add(item);
    }

    public T deQueue() {
        T temp = queue.get(0);
        queue.remove(0);
        return temp;
    }

    @Override
    public String toString(){
        StringBuffer string = new StringBuffer();
        for(int i = 0; i < queue.size(); i++){
            string.append(queue.get(i));
        }
        return string.toString();
    }
}
