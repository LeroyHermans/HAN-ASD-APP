package nl.han.app.Lists;

public class Node<T> {

    private T element;
    private Node next;

    public Node(T element, Node next){
        this.element = element;
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public int length(){
        int c = 0;
        Node element = this;
        while(element.hasNext()){
            element = element.next;
            c++;
        }
        return c;
    }

    public T getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return element + (hasNext() ? (", " + next) : "]");
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Node)){
            return false;
        }

        Node other = (Node) o;

        if(!this.element.equals(other.element)){
            return false;
        }
        return next == null ? other.next == null : next.equals(other.next);
    }

    @Override
    public int hashCode(){
        int result = element.hashCode();
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
