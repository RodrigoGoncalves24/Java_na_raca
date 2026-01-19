package queue;

import java.util.Random;

public class testQueue {
    public static void main(String[] args) {
        Random rand = new Random();
        myQueue<Integer> queueInt = new myQueue();

        System.out.println("Teste de inserção de elementos:");
        queueInt.enqueue(4);
        queueInt.enqueue(8);
        queueInt.enqueue(28);
        queueInt.enqueue(-2);
        queueInt.print();
        System.out.println("\nTamanho: "+queueInt.size());
        System.out.println("\nOlhando o primeiro elemento sem remover: "+queueInt.peek());

        System.out.println("\nTeste de remoção de elemento:");
        System.out.println("Removendo... "+queueInt.dequeue());
        System.out.println("Removendo... "+queueInt.dequeue());
        System.out.println("Removendo... "+queueInt.dequeue());
        queueInt.print();
        System.out.println("\nTamanho: "+queueInt.size());

        System.out.println("\nInserindo novos elementos e testando expansão da fila");

        for (int i = 0; i < 15; i++){
            queueInt.enqueue(rand.nextInt(-10, 20));
        }

        System.out.println("Fila expandida!");
        queueInt.print();
        System.out.println("\nTamanho: "+queueInt.size());

        System.out.println("\nOlhando o primeiro elemento sem remover: "+queueInt.peek());

        System.out.println("\nEsta vazio? "+queueInt.isEmpty());
        System.out.println("\nTamanho da fila: "+queueInt.size());

        System.out.println("\nLimpando a fila");
        queueInt.clear();
        System.out.println("Tamanho: "+queueInt.size());


        System.out.println("\nTestando com tipo String:");
        myQueue<String> queueStr = new myQueue<>();

        queueStr.enqueue("Oi");
        queueStr.enqueue("HI");
        queueStr.enqueue("Bonjour");
        queueStr.enqueue("Hallo");

        System.out.println("Tirando elemento... "+queueStr.dequeue());
        System.out.println("Olhando elemento... "+queueStr.peek());
        queueStr.print();

        System.out.println("\n\nTestando com tipo char");
        myQueue<Character> queueChar = new myQueue<>();

        queueChar.enqueue('A');
        queueChar.enqueue('B');
        queueChar.enqueue('C');
        queueChar.enqueue('D');

        System.out.println("Tirando elemento... "+queueChar.dequeue());
        System.out.println("Olhando elemento... "+queueChar.peek());
        queueChar.print();






    }
}
