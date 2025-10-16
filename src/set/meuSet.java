package set;

///  first a setLis with type integer
public class meuSet {
    private static int tamanho = 10;
    private static int[] set;
    private static int size;

    /// creat a setList
    public meuSet() {
        set = new int[tamanho];
        size = 0;
    }

    /// add an element
    public boolean add(int elemento) {
        if (!contains(elemento)) {
            if (size == tamanho) dobraTamanho();
            set[size] = elemento;
            size++;
            return true;
        }
        return false;
    }

    /// check if it empty
    public boolean isEmpty() {
        return size == 0;
    }

    /// contains the element
    public boolean contains(int valor) {
        for (int i = 0; i < size; i++) {
            if (set[i] == valor) return true;
        }
        return false;

    }

    /// remove an element
    public boolean remove(int valor) {
        for (int i = 0; i < size; i++) {
            if (valor == set[i]) {
                for (int j = i; j < size-1; j++) {
                    set[j] = set[j+1];
                }
                size--;
                return true;
            }
        }
        return false;
    }


    /// return the size
    public int size() {
        return size;
    }


    /// double the size
    public void dobraTamanho() {
        tamanho*=2;
        int[] novoSet = new int[tamanho];
        for (int i = 0; i < size; i++) {
            novoSet[i] = set[i];
        }
        set = novoSet;
    }

    /// clear the set
    public void clear() {
        size = 0;
        tamanho = 10;
        set = new int[tamanho];
    }

    /// order with mergeSort
    public void sort() {
        mergeSort(set, 0, size - 1);
    }

    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, right, mid);
        }

    }

    public void merge(int[] array, int left, int right, int mid) {
        int[] temporario = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) temporario[k++] = array[i++];
            else temporario[k++] = array[j++];
        }

        while (i <= mid) temporario[k++] = array[i++];
        while (j <= right) temporario[k++] = array[j++];

        for (k = 0; k < temporario.length; k++) array[left + k] = temporario[k];


    }

    /// show the values
    public int get(int pos){
        return set[pos];
    }
}
