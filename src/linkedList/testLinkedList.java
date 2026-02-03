package linkedList;

public class testLinkedList {
    public static void main(String[] args) {
        System.out.println("Teste com valores interiros");
        myLinkedList linkedListInt = new myLinkedList();

        System.out.println("\nAdicionando no inicio da lista");
        linkedListInt.addFirst(5);
        linkedListInt.addFirst(10);
        linkedListInt.addFirst(6);
        linkedListInt.addFirst(-2);

        System.out.println("Printando elementos");
        linkedListInt.print();

        System.out.print("\nTail: ");
        linkedListInt.printTail();

        System.out.print("\nHead: ");
        linkedListInt.printHead();

        System.out.println("\nAdicioando ao final da lista");
        linkedListInt.addLast(9);
        linkedListInt.addLast(15);
        linkedListInt.addLast(0);

        System.out.println("Printando elementos");
        linkedListInt.print();

        System.out.print("\nTail: ");
        linkedListInt.printTail();

        System.out.println("\nRemovendo primeiro elemento");
        linkedListInt.removeFirst();
        linkedListInt.print();
        System.out.println("\nNovo head: ");
        linkedListInt.printHead();

        myLinkedList lista = new myLinkedList();
           lista.addFirst(5);
           lista.addFirst(6);
          lista.removeFirst();
          lista.print();




    }
}
