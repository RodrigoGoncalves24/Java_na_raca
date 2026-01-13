package stack;

import java.util.Random;

public class testStack {
    public static void main(String[] args) {
        myStack<Integer> stackInt = new myStack();
        Random rand = new Random();

        System.out.println("\nVerificando método push");
        /// test push element
        stackInt.push(5);
        stackInt.push(2);
        stackInt.push(8);
        stackInt.push(59);
        stackInt.push(-5);

        /// verify that's it work as expected
        stackInt.print();

        /// verify the pop method
        System.out.println("\nTamanho da pilha: "+stackInt.size());
        System.out.println("\nVerificando método pop");

        int pop1 = stackInt.pop();
        System.out.println("\nValor removido: "+pop1);

        int pop2 = stackInt.pop();
        System.out.println("Valor removido: "+pop2);

        /// check if the stack structure is as expected
        stackInt.print();

        /// check error if try pop at an empty stack
        myStack<Integer> stack2 = new myStack();
        try{
            int popValue = stack2.pop();
            System.out.println("Valor removido: "+popValue);
        }catch (StackException e){
            System.out.println(e);
        }

        /// Try peek method
        System.out.println("\nTeste método peek");
        int peekNum = stackInt.peek();
        System.out.println("Valor no topo: "+peekNum);

        System.out.println("\nVerificando se a pilha esta vazia");
        System.out.println(stackInt.isEmpty());

        System.out.println("\nVerificando tamanho da pilha");
        System.out.println(stackInt.size());

        /// Exceeding the maximum size
        int size = stackInt.size();
        System.out.println("\nTamnho: "+size);
        for(int i = size; i <= 20; i++ ){
            stackInt.push(rand.nextInt(0,20));
        }

        System.out.println("Tamanho da pilha aumentada: "+size+" -> "+stackInt.size());

        stackInt.print();
        System.out.println("\nRetirando elemento: "+stackInt.pop());
        System.out.println("Retirando elemento: "+stackInt.pop());
        System.out.println("Retirando elemento: "+stackInt.pop());

        /// Testing other types
        System.out.println("\nTestando outros tipos");

        /// String type
        System.out.println("\nString");

        myStack<String> stackStr = new myStack<>();
        stackStr.push("Oi");
        stackStr.push("Olá");
        stackStr.push("Ana");
        stackStr.push("Rodrigo");

        stackStr.print();

        /// Boolean type
        System.out.println("\nBoolean");
        myStack<Boolean> stackBool = new myStack<>();
        stackBool.push(true);
        stackBool.push(false);
        stackBool.push(false);
        stackBool.push(true);

        stackBool.print();

        /// Char type
        System.out.println("\nBoolean");
        myStack<Character> stackChar = new myStack<>();
        stackChar.push('!');
        stackChar.push('A');
        stackChar.push('L');
        stackChar.push('O');

        stackChar.print();

    }
}
