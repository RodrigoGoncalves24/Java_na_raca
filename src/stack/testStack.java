package stack;

public class testStack {
    public static void main(String[] args) {
        myStack stack = new myStack();

        System.out.println("\nVerificando método push");
        /// test push element
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(59);
        stack.push(-5);

        /// verify that's it work as expected
        stack.print();

        /// verify the pop method
        System.out.println("\nTamanho da pilha: "+stack.size());
        System.out.println("\nVerificando método pop");

        int pop1 = stack.pop();
        System.out.println("\nValor removido: "+pop1);

        int pop2 = stack.pop();
        System.out.println("Valor removido: "+pop2);

        /// check if the stack structure is as expected
        stack.print();

        /// check error if try pop at an empty stack
        myStack stack2 = new myStack();
        try{
            int popValue = stack2.pop();
            System.out.println("Valor removido: "+popValue);
        }catch (StackException e){
            System.out.println(e);
        }

        /// Try peek method
        System.out.println("\nTeste método peek");
        int peekNum = stack.peek();
        System.out.println("Valor no topo: "+peekNum);

        System.out.println("\nVerificando se a pilha esta vazia");
        System.out.println(stack.isEmpty());

        System.out.println("\nVerificando tamanho da pilha");
        System.out.println(stack.size());


    }
}
