package map;

public class meuMap {
    private int[] keys;
    private String[] values;
    private int size;
    private int tamanho = 5;

    /// constructor
    public meuMap() {
        keys = new int[tamanho];
        values = new String[tamanho];
        size = 1;
    }

    /// put - change the value with that key
    public void put(int key, String value) {
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
    public boolean containsKey(int key) {
        for (int i = 0; i <= size - 1; i++) {
            if (keys[i] == key) return true;
        }
        return false;
    }

    public boolean containsValue(String value){
        for (int i = 0; i < size - 1; i++){
            if(values[i].equalsIgnoreCase(value) ) return true;
        }
        return false;
    }

    /// return index of key
    private int indexOfKey(int key) {
        for (int i = 0; i < size; i++) {
            if (keys[i] == key) return i;
        }
        return -1;
    }

    /// get value from key
    public String get(int key){
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
        String[] tempValue = new String[tamanho];
        int[] tempKey = new int[tamanho];

        for(int i = 0; i< size; i++){
            tempValue[i] = values[i];
            tempKey[i] = keys[i];
        }
        values = tempValue;
        keys = tempKey;
    }

    /// remove
    public void remove(int key){
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
        values = new String[tamanho];
        keys = new int[tamanho];
        size = 0;
    }

}
