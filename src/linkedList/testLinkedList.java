package linkedList;

public class testLinkedList {
    public static void main(String[] args) {
        System.out.println("TEST WITH INTEGER VALUES");
        myLinkedList<Integer> linkedListInt = new myLinkedList();

        System.out.println("\nTest: adding elements at begin of the list");
        linkedListInt.addFirst(5);
        linkedListInt.addFirst(10);
        linkedListInt.addFirst(6);
        linkedListInt.addFirst(-2);

        System.out.println("Print elements"); // Verificando se o head muda
        linkedListInt.print();

        System.out.print("\nTail: ");
        linkedListInt.printTail();

        System.out.print("\nHead: ");
        linkedListInt.printHead();

        System.out.println("\nTest: adding at the end of the list");
        linkedListInt.addLast(9);
        linkedListInt.addLast(15);
        linkedListInt.addLast(1);

        System.out.println("Print the elements"); // Verificando se o tail muda
        linkedListInt.print();

        System.out.print("\nTail: ");
        linkedListInt.printTail();

        System.out.println("\nTest: Removing the first element");
        System.out.println("\nElement removed: "+linkedListInt.removeFirst());

        // Verificando se head muda e como a lista ficou
        linkedListInt.print();
        System.out.println("\nNew head: ");
        linkedListInt.printHead();

        System.out.println("\nTest in a lis with less than two elements (before the method remove)");
        myLinkedList lista = new myLinkedList();
        //lista.removeFirst(); // Teste de lançamento de exceção em lista vazia apos remover primeiro elemento
        lista.addFirst(5);
        lista.addFirst(6);

        System.out.println("\nTest: Removing the first element in a list with two elements");
        lista.print();
        System.out.println("\nElement removed: "+lista.removeFirst());
        System.out.println("\nList after removed the last element"); // Printar a lista com dois ou menos elementos
        lista.print();

        System.out.println("\nTest: Removing the last element");
        System.out.println("\nList: ");
        linkedListInt.print();
        System.out.println("\n");
        linkedListInt.printTail(); // debug para saber o último elemento

        System.out.println("\nElement removed: "+linkedListInt.removeLast());
        System.out.println("\nNew list");
        linkedListInt.print();
        System.out.println("\nNew tail: ");
        linkedListInt.printTail(); //Verificando nova tail

        System.out.println("\nIndex text: ");
        System.out.println("List: ");
        linkedListInt.print();

        int index4 = linkedListInt.get(4);
        System.out.println("\nGet index 4: "+index4);

//        int index10 = linkedListInt.get(10);
//        System.out.println("\Get a index that don't exist(10) "+index10);

        System.out.println("\nTest: Get the first element");
        System.out.println("First element: "+linkedListInt.getFirst());
        System.out.println("Test with index 0: "+linkedListInt.get(0));


        System.out.println("\nTest: Get the last element: ");
        int lastElement = linkedListInt.size();
        System.out.println("Last element: "+linkedListInt.getLast());
        System.out.println("Test with index 0: "+linkedListInt.get(lastElement));

        System.out.println("\nTest: remove element");
        linkedListInt.print();
        System.out.println("\nRemove the 2 element: "+linkedListInt.removeAt(2));
        linkedListInt.print();

        /// Adding more elements
        linkedListInt.addFirst(10);
        linkedListInt.addFirst(18);
        linkedListInt.addFirst(20);
        linkedListInt.addFirst(9);
        linkedListInt.addFirst(0);
        linkedListInt.addFirst(7);

        System.out.println("\n\nTest: remove the first occurrence of an element");
        System.out.println("Size: "+linkedListInt.size());
        linkedListInt.print();

        System.out.println("\n\nRemoving the first 7 (head): "+linkedListInt.remove(7));
        linkedListInt.print();
        System.out.println("\nSize: "+linkedListInt.size());

        System.out.println("\n\nRemoving the first 15 (tail): "+linkedListInt.remove(15));
        linkedListInt.print();
        System.out.println("\nSize: "+linkedListInt.size());

        System.out.println("\n\nRemoving a random element: "+linkedListInt.remove(10));
        linkedListInt.print();
        System.out.println("\nSize: "+linkedListInt.size());

        System.out.println("\n\nRemoving an element that don't exist in the list: "+linkedListInt.remove(1000));
        linkedListInt.print();
        System.out.println("\nSize: "+linkedListInt.size());

        System.out.println("\n\nTest: verify that an specific element exist on the list:");
        linkedListInt.print();
        System.out.println("\nVerify that 15 exist: "+linkedListInt.contains(15));
        System.out.println("\nVerify that 15 exist: "+linkedListInt.contains(9));

        System.out.println("\n\nTest: clear list");
        linkedListInt.clear();
        System.out.println("Size: "+linkedListInt.size());

        linkedListInt.addFirst(1);
        linkedListInt.addFirst(2);
        linkedListInt.addFirst(3);
        linkedListInt.print();
        System.out.println("\nSize: "+linkedListInt.size());

        System.out.printf("TES WITH STRINGS VALUES");
        myLinkedList <String> linkedListStr = new myLinkedList<>();
        linkedListStr.addFirst("House");
        linkedListStr.addFirst("Dog");
        linkedListStr.addFirst("Cat");
        linkedListStr.addFirst("Tree");
        System.out.println("\n\nPrint the list: ");
        linkedListStr.print();

        System.out.print("\nHead: ");
        linkedListStr.printHead();
        System.out.print("\nTail: ");
        linkedListStr.printTail();

        System.out.println("\n\nRemoving elements");
        linkedListStr.removeFirst();
        linkedListStr.print();
        System.out.println("\nNew head: ");
        linkedListStr.printHead();
        System.out.println("\n\nRandom value: ");
        System.out.println(linkedListStr.get(2));

    }
}
