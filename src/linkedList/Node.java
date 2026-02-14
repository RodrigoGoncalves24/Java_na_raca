package linkedList;


/// structure that represent a Node
public class Node<T> {
    public T value;
    public Node next;
    public Node prev;

    public Node(T value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }

}
