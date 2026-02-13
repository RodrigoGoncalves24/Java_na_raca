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
    public int getFirst() {
        if (head == null) throw new RuntimeException("Empty list");
        return head.value;
    }

    /// return the last element
    public int getLast() {
        if (head == null) throw new RuntimeException("Empty list");
        if (tail == null) return head.value; // head and tail is the same if it has only one element at the list
        else return tail.value;
    }

    /// remove by the index
    public int removeAt(int index) {
        int remove;
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
        remove = aux.value;
        Node prevAux = aux.prev;
        Node nextAux = aux.next;
        prevAux.next = nextAux;
        nextAux.prev = prevAux;

        size--;
        return remove;
    }

    /// remove the first occurrence of the element
    public boolean remove(int value) {
        boolean remove = false;
        Node aux = head;

        if (isEmpty()) throw new RuntimeException("Empty list!");

        int i = 0;
        int size = size();
        while(!remove || i <= size){
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
            else if (i == size()) {
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

    /// return the size
    public int size() {
        return size - 1;
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
