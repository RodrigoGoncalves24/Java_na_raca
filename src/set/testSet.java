package set;

import java.util.Random;

public class testSet {
    public static void main(String[] args) {
        Random rand = new Random();
        mySet<Integer> set = new mySet<>();

        System.out.println("TESTE DO SETLIST");
        System.out.println("\n ********** TESTE SET COM INTEGER **********");
        System.out.println("Adicionando valores...");
        set.add(2);
        set.add(5);
        set.add(2);
        set.add(2);
        imprimeSet(set);
        System.out.println("Valores adicionados com sucesso!");
        System.out.println("Esta vazio? "+set.isEmpty());
        System.out.println("Tamanho: "+set.size());

        System.out.println("\nAdicionando mais valores...");
        for(int i = 0; i< 30; i++){
            set.add(rand.nextInt(-10, 10));
        }
        imprimeSet(set);

        System.out.println("Elementos adicionados com sucesso e set dobrado de tamanho!");
        System.out.println("\nTamanho: "+set.size());
        System.out.println("O set contém o valor 10? "+set.contains(10));

        System.out.println("Remoção de elementos...");
        System.out.println("Removendo elemento 5: "+set.remove(5));
        System.out.println("Removendo elemento 2: "+set.remove(2));
        System.out.println("Tamanho: "+set.size());

//        System.out.println("\nOrdenando...");
//        set.sort();
//        imprimeSet(set);

        System.out.println("Limpando o set...");
        set.clear();
        System.out.println("Esta vazio? "+set.isEmpty());
        System.out.println("Tamanho: "+set.size());

        System.out.println("\n ********** TESTE SET COM STRINGS **********");
        mySet<String> set2 = new mySet<>();

        System.out.println("Adicionado valores...");
        set2.add("a"); /// different strings
        set2.add("A");
        set2.add("Rodrigo");
        set2.add("Rodrigo");
        set2.add("Victor");
        imprimeSet(set2);


    }

    public static void imprimeSet(mySet set){
        for(int i = 0; i<set.size(); i++){
            System.out.println(i+"° "+set.get(i));
        }
    }

}
