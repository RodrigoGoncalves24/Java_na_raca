package set;

///  first a setLis with type integer
public class meuSet {
    private static final int tamanho = 10;
    private static int[] set;
    private static int size;

    /// creat a setList
    public meuSet() {
        set = new int[tamanho];
        size = 0;
    }

    /// add an element
    public void add(int elemento) {
        if (!valorInserido(elemento)) {
            set[size] = elemento;
            size++;
        }

    }

    /// get the element
    public int get(int pos){
        if(pos < 0 || pos > size || size == 0) throw new IndexOutOfBoundsException("Posição inválida "+pos);
        return set[pos];
    }

    /// remove an element
    public void remove(int pos){
        for(int i = pos; i<size; i++){
            set[i] = set[i+1];
        }
        size--;
    }

    /// return the size
    public int size(){
        return size;
    }

    /// search if the setList contains the value
    public boolean valorInserido(int valor) {
        for (int i = 0; i < size; i++) {
            if (valor == set[i]) {
                return true;
            }
        }
        return false;
    }
}
