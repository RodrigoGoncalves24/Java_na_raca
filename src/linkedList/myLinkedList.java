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
        }else if(tail == null){
            tail = novo;
            head.next = tail;
            tail.prev = head;
        }else{
            Node aux = tail;
            tail = novo;
            tail.prev = aux;
            aux.next = tail;
        }
        size++;
    }

    /// remove the first element
    public void removeFirst(){
        if (head == null) throw new RuntimeException("Empty List!");
        else if (tail == null) {
            head = null; // Empty list
        }else{
            head = head.next;
            head.prev = null;
        }

        size--;
    }






    /// ******* DEBUG FUNCTIONS *******

    public void printTail() {
        System.out.print(tail.value);
    }

    public void printHead(){
        System.out.print(head.value);
    }


    /// print the list - AJUSTAR PARA LISTA COM APENAS UM ELEMENTO OU VAZIA
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
