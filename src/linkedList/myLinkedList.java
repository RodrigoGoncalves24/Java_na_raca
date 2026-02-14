package linkedList;

public class myLinkedList<T> {
    private Node head;
    private Node tail;
    private int size = -1;

    public myLinkedList() {
    }

    /// add an element at first of the list
    public void addFirst(T value) {
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
    public void addLast(T value) {
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
    public T removeFirst() {
        T element;
        if (head == null) throw new RuntimeException("Empty List!");
        else if (tail == null) {
            element = (T) head.value;
            head = null; // Empty list
        } else {
            element = (T) head.value;
            head = head.next;
            head.prev = null;
        }
        size--;
        return element;
    }

    ///  remove the last element
    public T removeLast() {
        Object element;
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
        return (T) element;
    }

    /// return the value int the specification index
    public T get(int index) {
        if (index > size || index < 0) throw new RuntimeException("Index don't exist!");
        if (head == null) throw new RuntimeException("List Empty!");
        int i = 0;
        Node aux = head;
        while (i < index) {
            aux = aux.next;
            i++;
        }
        return (T) aux.value;

    }

    /// return the first element
    public T getFirst() {
        if (head == null) throw new RuntimeException("Empty list");
        return (T) head.value;
    }

    /// return the last element
    public T getLast() {
        if (head == null) throw new RuntimeException("Empty list");
        if (tail == null) return (T) head.value; // head and tail is the same if it has only one element at the list
        else return (T) tail.value;
    }

    /// remove by the index
    public T removeAt(int index) {
        T remove;
        if (index > size() || index < 0) throw new RuntimeException("Invalid index");
        if (isEmpty()) throw new RuntimeException("Empty list!");
        if (index == 0) {
            remove = removeFirst();
        } else if (index == size()) {
            remove = removeLast();
        }
        Node aux = head;
        int i = 0;
        while (i < index) {
            aux = aux.next;
            i++;
        }
        remove = (T) aux.value;
        Node prevAux = aux.prev;
        Node nextAux = aux.next;
        prevAux.next = nextAux;
        nextAux.prev = prevAux;

        size--;
        return remove;
    }

    /// remove the first occurrence of the element
    public boolean remove(T value) {
        boolean remove = false;
        Node aux = head;

        if (isEmpty()) throw new RuntimeException("Empty list!");

        int i = 0;
        while(!remove && i <= size()){
            if (aux != null){
                if(aux.value == value){
                    remove = true;
                    break;
                }
                aux = aux.next;
                i++;
            }else{
                break;
            }

        }

        if(remove){
            if (i == 0) {
                removeFirst(); // se o valor de head for igual ao primeiro elemento
            }
            else if (i == size) {
                removeLast(); // se o tail for o valor para remover
            } else {
                Node prevAux = aux.prev;
                Node nextAux = aux.next;
                prevAux.next = nextAux;
                nextAux.prev = prevAux;
                size--; // remover head e tail já faz size--
            }
        }

        return remove;

    }

    /// verify that the list contains a specific value
    public boolean contains(T value){
        boolean contains = false;
        Node aux = head;

        for (int i = 0; i < size()-1; i++) {
            if(aux.value == value){
                contains = true;
                break;
            }
            aux = aux.next;

        }

        return contains;


    }

    /// clear the list
    public void clear(){
        head = null;
        tail = null;
        size = -1;
    }

    /// return the size
    public int size() {
        return size;
    }

    /// return list empty
    public boolean isEmpty() {
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
                for (int i = 0; i <= size; i++) {
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
