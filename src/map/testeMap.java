package map;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class testeMap {
    public static void main(String[] args) {
        meuMap map = new meuMap();
        Random rand = new Random();


        List<String> nomes = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
        System.out.println("************ TESTE MAP ************");
        System.out.println("Inserindo valor:");
        map.put(1, "Rodrigo");
        System.out.println("Pegando valores: "+map.get(2));
        map.put(2, "Leonardo");
        System.out.println("Pegando valores: "+map.get(1));

        System.out.println("\nInserindo valor e dobrando de tamanho...");
        for(int i = 0; i< 15; i++){
            map.put(i, nomes.get(rand.nextInt(0, 7)));
        }

        System.out.println("Valores inseridos e map dobrado de tamanho!!");
        for(int i = 0; i< map.size(); i++){
            System.out.println(i+"° - "+map.get(i));
        }

        System.out.println("Teste trocando elementos");
        map.put(10, "Rodrigo");
        System.out.println(map.get(10));

    }
}
