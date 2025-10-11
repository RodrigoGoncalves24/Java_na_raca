package array;

import java.util.Random;

public class testeArray {
    public static void main(String[] args) throws Exception {
        meuArray array = new meuArray();
        Random ran = new Random();

        System.out.println("INSERINDO ELEMENTOS");
        // add elements
        array.add(6);
        array.add(10);
        array.add(9);
        array.add(56);
        array.add(-2);
        array.add(10);
        array.add(-5);
        System.out.println("\nELEMENTO INSERIDOS COM SUCESSO");

        System.out.println("Primeiro elemento com getFirst(): "+array.getFirst());
        System.out.println("Segundo elemento: "+array.get(1));
        System.out.println("Tamanho do array: "+array.size());

        // test to get an element
        System.out.println("\nELEMENTOS DO ARRAY");
        retornaArray(array);

        //System.out.println("\nTESTE DE ACESSAR POSIÇÕES INEXISTENTES");
        //System.out.println("\nAcessando posição que não existe (negativa): "+array.get(-2));
        //System.out.println("Acessando posição que não existe (maior que o array): "+array.get(100));


        System.out.println("\nREMOÇÃO DE ELEMENTOS");
        System.out.println("Removendo elementos: "+array.get(4));
        array.remove(4);
        retornaArray(array);
        System.out.println("Tamanho do array após remoção: "+array.size());

        array.remove(2);
        retornaArray(array);

        System.out.println("\nTESTANDO AUMENTO DO ARRAY");
        System.out.println("Tamanho do array: "+array.size());

        System.out.println("\nTeste de capacidade:");
        for(int i = 0; i<100; i++){
            array.add(ran.nextInt(-100, 100));
        }
        System.out.println("Array dobrado com sucesso!");

        retornaArray(array);


        System.out.println("\nMUDANDO VALOR DE LUGAR");
        System.out.println("Trocando o valor "+array.get(5)+" por 1000");
        array.set(5, 1000);
        System.out.println("Após a troca: "+array.get(5));

        System.out.println("\nTESTE DE ORDENAÇÃO");
        array.bubbleSort();

        System.out.println("Array ordenado com sucesso!");
        retornaArray(array);








    }

    public static void retornaArray(meuArray array){
        for(int i =0;  i< array.size(); i++){
            System.out.println(i+"° "+array.get(i));
        }
    }




}
