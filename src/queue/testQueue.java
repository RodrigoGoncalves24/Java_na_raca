package queue;

import java.util.Random;

public class testQueue {
    public static void main(String[] args) {
        Random rand = new Random();
        myQueue queue = new myQueue();


        System.out.println("Teste de inserção de elementos:");
        queue.enqueue(4);
        queue.enqueue(8);
        queue.enqueue(28);
        queue.enqueue(-2);
        queue.print();
        System.out.println("\nTamanho: "+queue.size());
        System.out.println("\nOlhando o primeiro elemento sem remover: "+queue.peek());

        System.out.println("\nTeste de remoção de elemento:");
        System.out.println("Removendo... "+queue.dequeue());
        System.out.println("Removendo... "+queue.dequeue());
        System.out.println("Removendo... "+queue.dequeue());
        queue.print();
        System.out.println("\nTamanho: "+queue.size());

        System.out.println("\nInserindo novos elementos e testando expansão da fila");

        for (int i = 0; i < 15; i++){
            queue.enqueue(rand.nextInt(-10, 20));
        }

        System.out.println("Fila expandida!");
        queue.print();
        System.out.println("\nTamanho: "+queue.size());

        System.out.println("\nOlhando o primeiro elemento sem remover: "+queue.peek());

        System.out.println("\nEsta vazio? "+queue.isEmpty());
        System.out.println("\nTamanho da fila: "+queue.size());

        System.out.println("\nLimpando a fila");
        queue.clear();
        System.out.println("Tamanho: "+queue.size());

    }
}
