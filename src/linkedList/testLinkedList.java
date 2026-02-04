package linkedList;

public class testLinkedList {
    public static void main(String[] args) {
        System.out.println("Teste com valores interiros");
        myLinkedList linkedListInt = new myLinkedList();

        System.out.println("\nTeste: Adicionando no inicio da lista");
        linkedListInt.addFirst(5);
        linkedListInt.addFirst(10);
        linkedListInt.addFirst(6);
        linkedListInt.addFirst(-2);

        System.out.println("Printando elementos"); // Verificando se o head muda
        linkedListInt.print();

        System.out.print("\nTail: ");
        linkedListInt.printTail();

        System.out.print("\nHead: ");
        linkedListInt.printHead();

        System.out.println("\nTeste: Adicioando ao final da lista");
        linkedListInt.addLast(9);
        linkedListInt.addLast(15);
        linkedListInt.addLast(1);

        System.out.println("Printando elementos"); // Verificando se o tail muda
        linkedListInt.print();

        System.out.print("\nTail: ");
        linkedListInt.printTail();

        System.out.println("\nTeste: Removendo primeiro elemento");
        System.out.println("\nElemento removido: "+linkedListInt.removeFirst());

        // Verificando se head muda e como a lista ficou
        linkedListInt.print();
        System.out.println("\nNovo head: ");
        linkedListInt.printHead();

        System.out.println("\nTeste em uma lista com menos elementos (antes do método remove)");
        myLinkedList lista = new myLinkedList();
        //lista.removeFirst(); // Teste de lançamento de exceção em lista vazia apos remover primeiro elemento
        lista.addFirst(5);
        lista.addFirst(6);

        System.out.println("\nTeste: Removendo o primeiro elemento de uma lista com dois elementos");
        lista.print();
        System.out.println("\nElemento removido: "+lista.removeFirst());
        System.out.println("\nLista após remover o primeiro elemento"); // Printar a lista com dois ou menos elementos
        lista.print();

        System.out.println("\nTeste: Removendo o último elemento");
        System.out.println("\nLista: ");
        linkedListInt.print();
        System.out.println("\n");
        linkedListInt.printTail(); // debug para saber o último elemento

        System.out.println("\nElemento removido: "+linkedListInt.removeLast());
        System.out.println("\nNova lista");
        linkedListInt.print();
        System.out.println("\nNovo tail: ");
        linkedListInt.printTail(); //Verificando nova tail

        System.out.println("\nTeste de index: ");
        System.out.println("Lista: ");
        linkedListInt.print();

        int index4 = linkedListInt.get(4);
        System.out.println("\nRecuperando o index 4: "+index4);

        int inde10 = linkedListInt.get(10);
        System.out.println("\nRecuperndo o index que não existe (10) "+inde10);




    }
}
