package nl.han.app.Tree;

public class Tree<T> {

    private T value;
    private Tree<T> firstChild; // child node
    private Tree<T> nextSibling; // next node on same level

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Tree<T> getNextSibling() {
        return nextSibling;
    }

    public void setNextSibling(Tree<T> nextSibling) {
        this.nextSibling = nextSibling;
    }

    public Tree<T> getFirstChild() {
        return firstChild;
    }

    public void addChild(Tree<T> child){
        if(firstChild == null){
            firstChild = child;
        } else {
            child.nextSibling = child;
            firstChild = child;
        }
    }

    public boolean isLeaf() {return this.firstChild == null; }

    @Override
    public String toString() {
        String S = "[ " + value.toString();
        Tree<T> N = firstChild;
        while (N != null) {
            S = S + " " + N.toString();
            N = N.nextSibling;
        }
        return S+" ]";
    }

}
