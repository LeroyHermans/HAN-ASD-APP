package nl.han.app.Tree;


@SuppressWarnings("ALL")
public class BinarySearchTree<T extends Comparable<T>> {

    private T value;
    private BinarySearchTree<T> left, right;

    public void add(T newValue) {
        if (newValue == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (this.getValue() == null) {
            this.setValue(newValue);
            return;
        }

        int compareTo = newValue.compareTo(getValue());
        if (compareTo == 0) {
            throw new IllegalArgumentException("Key already in tree");
        } else if (compareTo < 0) {
            if (!hasLeft()) {
                this.setLeft(createNewNode());
            }
            this.getLeft().add(newValue);
        } else {
            if (!hasRight()) {
                this.setRight(createNewNode());
            }
            this.getRight().add(newValue);
        }
    }

    private BinarySearchTree<T> createNewNode() {
        return new BinarySearchTree<T>();
    }

    public void add(T... newValue){
        for(T t : newValue){
            add(t);
        }
    }

    public T find(T key){
        BinarySearchTree<T> subTree = findSubTree(key);
        if(subTree == null){
            return null;
        }
        return subTree.getValue();
    }

    private BinarySearchTree<T> findSubTree(T key) {
        if(getValue() == null){
            return null;
        }
        if(key == null){
            throw new IllegalArgumentException("Key cannot be null");
        }
        int compareTo = key.compareTo(getValue());
        if(compareTo == 0){
            return this;
        } else if (compareTo > 0){ // new key > value
            if(!hasRight()){
                return null;
            }
            return getRight().findSubTree(key);
        } else {
            if(!hasLeft()){
                return null;
            }
            return getLeft().findSubTree(key);
        }
    }

    public BinarySearchTree<T> findMin(BinarySearchTree tree){
        if(tree == null){
            return null;
        }
        if(tree.getLeft() == null){
            return tree;
        }
        return findMin(tree.getLeft());
    }

    public BinarySearchTree<T> findMax(BinarySearchTree tree){
        if(tree == null){
            return null;
        }

        if(tree.getRight() == null){
            return tree;
        }
        return findMax(tree.getRight());
    }

    public boolean hasRight() {
        return this.getRight() != null && this.getRight().getValue() != null;
    }

    public boolean hasLeft() {
        return this.getLeft() != null && this.getLeft().getValue() != null;
    }

    public boolean hasBothChildren(){
        return hasRight() && hasLeft();
    }

    public boolean hasValue(){
        return this.value != null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinarySearchTree<T> getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree<T> left) {
        this.left = left;
    }

    public BinarySearchTree<T> getRight() {
        return right;
    }

    public void setRight(BinarySearchTree<T> right) {
        this.right = right;
    }
}
