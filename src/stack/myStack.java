package stack;

public class myStack<T> {
    private T[] stack;
    private int size = 0;
    private int tamanho = 10;

    /// Create the structure
    public myStack() {
    }

    /// add element
    public void push(T x) {
        if (size == 0) {
            stack = (T[]) new Object[tamanho];
        }else if (size == tamanho){
            doubleSize(); /// double size of stack
        }
        stack[size] = x;
        size++;
    }

    /// remove and return the top element
    public T pop() {
        if (size == 0) throw new StackException("The stack is empty, no element can be removed");
        T popNum = stack[size - 1];
        size--;
        return popNum;
    }

    /// method to return the top element
    public T peek(){
        if(size == 0) throw new StackException("The stack is empty, no element can be removed");
        return stack[size-1];
    }

    /// method isEmpty
    public boolean isEmpty(){
        return size == 0;
    }

    /// method size
    public int size(){
        return size-1;
    }


    /// method to double the stack size if it's equals tamanho
    private void doubleSize() {
        tamanho *= 2;
        T[] stackTemp = (T[])new Object[tamanho];

        for (int i = 0; i < size; i++) {
            stackTemp[i] = stack[i];
        }

        stack = stackTemp;

    }

    /// helper function to print the stack
    public void print() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
