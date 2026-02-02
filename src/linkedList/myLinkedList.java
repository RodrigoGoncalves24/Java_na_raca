package linkedList;

public class myLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public myLinkedList() {
    }

    /// add an element at first of the list
    public void addFirst(int value) {
        Node novo = new Node(value);
        if (head == null) {
            head = novo;
        } else if (head.next == null) {
            Node aux = head;
            head = novo;
            tail = aux;
            head.next = aux;
            tail.prev = head;
        } else {
            Node aux2 = head;
            head = novo;
            head.next = aux2;
            aux2.prev = head;
        }
        size++;
    }

    /// add an element at the end  of the list
    public void addLast(int value) {
        Node novo = new Node(value);
        if (head == null) {
            head = novo;
        }else if(head.next == null){
            Node aux = tail;
            head = aux;
            tail = novo;
            tail.prev = aux;
            head.next = tail;
        }else{
            Node aux2 = tail;
            tail = novo;
            tail.prev = aux2;
            aux2.next = tail;
        }
        size++;
    }

    public void printTail() {
        System.out.print(tail.value);
    }


    /// print the list
    public void print() {
        Node aux = head;
        Node aux2 = head.next;
        for (int i = 0; i < size; i++) {
            System.out.print(aux.value + " -> ");
            aux = aux2;
            if(aux2.next != null){
                aux2 = aux2.next;
            }

        }
    }


}
