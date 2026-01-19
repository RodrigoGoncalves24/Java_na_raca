package queue;

public class myQueue <T> {
    private int tamanhoMax = 10;
    private int size = 0;
    private T[] queue;

    /// create the struture
    public myQueue(){
        queue = (T[])new Object[tamanhoMax];
    }

    /// ads an element
    public void enqueue(T x) {
        if (size == tamanhoMax) doubleSize();
        queue[size] = x;
        size++;
    }

    ///  Removes and returns the first element
    public T dequeue(){
        T element = queue[0];
        for (int i = 0; i< size-1; i++){
            queue[i] = queue[i+1];
        }
        size--;

        return element;
    }

    /// Returns the first element without removing it
    public T peek(){
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
        queue = (T[]) new Object[tamanhoMax];
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
        T[] queueTemp = (T[]) new Object[novoTamanho];

        for (int i = 0; i< size; i++){
            queueTemp[i] = queue[i];
        }

        queue = queueTemp;
    }

}
