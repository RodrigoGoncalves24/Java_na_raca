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
        } else if (tail == null) {
            tail = head;
            head = novo;
            head.next = tail;
            tail.prev = head;
        } else {
            Node aux = head;
            head = novo;
            head.next = aux;
            aux.prev = head;
        }
        size++;
    }

    /// add an element at the end  of the list
    public void addLast(int value) {
        Node novo = new Node(value);
        if (head == null) {
            head = novo;
        } else if (tail == null) {
            tail = novo;
            head.next = tail;
            tail.prev = head;
        } else {
            Node aux = tail;
            tail = novo;
            tail.prev = aux;
            aux.next = tail;
        }
        size++;
    }

    /// remove the first element
    public int removeFirst() {
        int element;
        if (head == null) throw new RuntimeException("Empty List!");
        else if (tail == null) {
            element = head.value;
            head = null; // Empty list
        } else {
            element = head.value;
            head = head.next;
            head.prev = null;
        }
        size--;
        return element;
    }

    ///  remove the last element
    public int removeLast() {
        int element;
        if (head == null) throw new RuntimeException("Empty List!");
        else if (tail == null) { // Levando em conta que o head é o tail (estranho?)
            element = head.value;
            head = null;
        } else {
            element = tail.value;
            tail = tail.prev;
            tail.next = null;
        }
        size--;

        return element;
    }

    /// return the value int the specification index
    public int get(int index) {
        if (index > size || index < 0) throw new RuntimeException("Index don't exist!");
        if (head == null) throw new RuntimeException("List Empty!");
        int i = 0;
        Node aux = head;
        while (i < index) {
            aux = aux.next;
            i++;
        }
        return aux.value;

    }

    /// return the first element
    public int getFirst(){
        if(head == null) throw new RuntimeException("Empty list");
        return head.value;
    }

    /// return the last element
    public int getLast(){
        if(head == null) throw new RuntimeException("Empty list");
        if(tail == null) return head.value;
        else return tail.value;
    }


    /// return the size
    public int size(){
        return size-1;
    }

    /// return list empty
    public boolean isEmpty(){
        return size == 0;
    }

    /// ******* DEBUG FUNCTIONS *******

    public void printTail() {
        System.out.print(tail.value);
    }

    public void printHead() {
        System.out.print(head.value);
    }


    /// print the list
    public void print() {
        if (head != null) { // se lista vazia
            Node aux = head;

            if (head.next != null) { // se apenas um elemento na lista
                Node aux2 = head.next;
                for (int i = 0; i < size; i++) {
                    System.out.print(aux.value + " -> ");
                    aux = aux2;
                    if (aux2.next != null) {
                        aux2 = aux2.next;
                    }
                }
                return;
            }
            System.out.println(head.value);
        }

    }


}
