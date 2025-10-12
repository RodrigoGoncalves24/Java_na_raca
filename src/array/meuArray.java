package array;

public class meuArray {
    private static int[] array;
    private static int tamanho = 10;
    private static int size = 0;

    /// creat the array with 10 positions
    public meuArray() {
        array = new int[tamanho];
    }

    /// add element
    public void add(int valor) {
        if (size == tamanho) {
            dobrarArray(); /// method to double
        }
        array[size] = valor;
        size++;
    }

    /// double the size and put the elements for the correct position
    private void dobrarArray() {
        tamanho *= 2;
        int[] dobroArray = new int[tamanho];

        for (int i = 0; i < tamanho / 2; i++) {
            dobroArray[i] = array[i];
        }
        array = dobroArray;

    }


    /// remove element and organize
    public void remove(int posicao) {
        if (posicao > size || posicao < 0) {
            System.out.println("Posição inválida");
        }

        for (int i = posicao; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;

    }

    /// get position
    public int get(int posicao) {
        if (posicao < 0 || posicao > size) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return array[posicao];
    }

    /// get size
    public int size() {
        return size;
    }


    /// get fist number
    public int getFirst() {
        return array[0];
    }

    /// change values
    public void set(int pos, int valor) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Posição inválida: " + pos);
        }
        array[pos] = valor;
    }

    /// order with bubble sort
    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) { //Compara vizinhos em ordem crescente para evistar passar por elementos já testados
                    int valor = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = valor;
                }
            }

        }
    }
}



