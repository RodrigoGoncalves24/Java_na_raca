package queue;

public class myQueue {
    private int tamanhoMax = 10;
    private int size = 0;
    private int [] queue;

    /// create the struture
    public myQueue(){
        queue = new int[tamanhoMax];
    }

    /// ads an element
    public void enqueue(int x) {
        if (size == tamanhoMax) doubleSize();
        queue[size] = x;
        size++;
    }

    ///  Removes and returns the first element
    public int dequeue(){
        int element = queue[0];
        for (int i = 0; i< size-1; i++){
            queue[i] = queue[i+1];
        }
        size--;

        return element;
    }

    /// Returns the first element without removing it
    public int peek(){
        return queue[0];
    }

    /// Returns the size
    public int size(){
        return size;
    }

    /// Returns if it empties
    public boolean isEmpty(){
        return size == 0;
    }


    /// Clear the structure
    public void clear(){
        queue = new int[tamanhoMax];
        size = 0;
    }

    /// Print the elements
    public void print(){
        for (int i = 0; i < size; i++){
            System.out.print(queue[i]+", ");
        }
    }

    /// double size of the queue
    private void doubleSize() {
        int novoTamanho = tamanhoMax * 2;
        int[] queueTemp = new int [novoTamanho];

        for (int i = 0; i< size; i++){
            queueTemp[i] = queue[i];
        }

        queue = queueTemp;
    }

}
