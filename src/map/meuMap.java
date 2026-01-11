package map;

/// turning map to a generic type
public class meuMap<K, V> {
    private K[] keys;
    private V[] values;
    private int size;
    private int tamanho = 5;

    /// constructor
    public meuMap() {
        keys = (K[]) new Object[tamanho];
        values = (V[]) new Object[tamanho];
        size = 0;
    }

    /// put - change the value with that key
    public void put(K key, V value) {
        if (size == tamanho) doubleSize();
        int index = indexOfKey(key);
        if (index == -1) {
            keys[size] = key;
            values[size] = value;
            size++;
        } else {
            values[index] = value;
        }

    }

    ///  contains key
    public boolean containsKey(K key) {
        for (int i = 0; i <= size - 1; i++) {
            if (keys[i] == key) return true;
        }
        return false;
    }

    public boolean containsValue(V value){
        for (int i = 0; i < size - 1; i++){
            if(values[i] == value ) return true;
        }
        return false;
    }

    /// return index of key
    private int indexOfKey(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i] == key) return i;
        }
        return -1;
    }

    /// get value from key
    public V get(K key){
        int index = indexOfKey(key);
        if(index != -1) return values[index];
        else return null;
    }

    /// get size
    public int size(){
        return size;
    }

    private void doubleSize() {
        tamanho *= 2;
        V[] tempValue = (V[]) new Object[tamanho];
        K[] tempKey = (K[]) new Object[tamanho];

        for(int i = 0; i< size; i++){
            tempValue[i] = values[i];
            tempKey[i] = keys[i];
        }
        values = tempValue;
        keys = tempKey;
    }

    /// remove
    public void remove(K key){
        int index = indexOfKey(key);
        if(index != -1){
            for(int i = index; i < size; i++){
                values[i] = values[i+1];
                keys[i] = keys[i+1];
            }
            size--;
        }
    }


    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        values = (V[]) new Object[tamanho];
        keys = (K[])new Object[tamanho];
        size = 0;
    }

    public void print(){
        for (int i = 0; i< size; i++){
            if(containsKey(keys[i])){
                System.out.println(keys[i]+" -> "+values[i]);
            }

        }
    }

}
