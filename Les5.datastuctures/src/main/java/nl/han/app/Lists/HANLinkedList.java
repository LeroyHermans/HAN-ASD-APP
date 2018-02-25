package nl.han.app.Lists;

import nl.han.app.Lists.Interfaces.IHANLinkedList;

public class HANLinkedList<T> implements IHANLinkedList<T> {

    private Node<T> head = null;
    private int size = 0;

    public HANLinkedList() {
    }

    public void addFirst(T value) {
        head = new Node<T>(value, head);
        size++;
    }

    public void removeFirst() {
        if(head == null){
            throw new IndexOutOfBoundsException();
        }
        head = head.getNext();
        size--;
    }

    public void insert(int index, T value) {
        if(index == 0){
            addFirst(value);
            return;
        }

        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        Node element = head;
        while(i != index -1){
            element = element.getNext();
            i++;
        }
        element.setNext(new Node(value, element.getNext()));
        size++;
    }

    public void delete(int index) {
        if(index == 0){
            removeFirst();
            return;
        }

        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        Node element = head;
        while(i != index -1){
            element = element.getNext();
            i++;
        }
        if(element.getNext() == null){
            throw new IndexOutOfBoundsException();
        }
        element.setNext(element.getNext().getNext());
        size--;
    }

    public T get(int index) {
        int i = 0;
        Node<T> element = head;
        while(i != index){
            if(!element.hasNext()){
                throw new IndexOutOfBoundsException();
            }
            element = element.getNext();
            i++;
        }
        return element.getElement();
    }

    public int getSize() {
        return size;
    }
}

