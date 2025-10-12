package set;

import java.util.Random;

public class testeSet {
    public static void main(String[] args) {
        Random rand = new Random();

        meuSet set = new meuSet();

        System.out.println("TESTE DO SETLIST");
        set.add(2);
        set.add(5);
        set.add(2);
        set.add(2);
        System.out.println("Esta vazio? "+set.isEmpty());

        System.out.println("\nAdicionando elementos...");
        for(int i = 0; i< 20; i++){
            set.add(rand.nextInt(-10, 10));
        }
        imprimeSet(set);

        System.out.println("Elementos adicionados com sucesso e set dobrado de tammanho!")
        ;
        System.out.println("\nTamanho: "+set.size());
        System.out.println("O set contém o valor 10? "+set.contains(10));

        System.out.println("\nRemovendo elementos: ");
        set.remove(5);
        System.out.println("\nTamanho: "+set.size());

        System.out.println("\nLimpando o set: ");
        System.out.println("Esta vazio? "+set.isEmpty());
        System.out.println("Tamanho: "+set.size());

        System.out.println("\nOrdenando...");
        set.sort();
        imprimeSet(set);



    }

    public static void imprimeSet(meuSet set){
        for(int i = 0; i<set.size(); i++){
            System.out.println(i+"° "+set.get(i));
        }
    }

}
