package map;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class testeMap {
    public static void main(String[] args) {
        meuMap map = new meuMap();
        Random rand = new Random();


        List<String> nomes = Arrays.asList("Ana", "Bia", "Carlos", "Diogo", "Edu", "Fabiana", "Gustavo");
        System.out.println("************ TESTE MAP ************");
        System.out.println("Inserindo valor:");
        map.put(1, "Rodrigo");
        System.out.println("Pegando valores: "+map.get(1));
        map.put(2, "Leonardo");
        System.out.println("Pegando valores: "+map.get(2));
        System.out.println("\nVerificando se a chave 2 existe no mapa: "+map.containsKey(2));

        System.out.println("\nInserindo valores");
        for(int i = 0; i<10; i++){
            map.put(i, nomes.get(rand.nextInt(0, 7)));
        }

        System.out.println("Teste trocando elementos: Trocando elemento 3 -> "+map.get(3));
        map.put(3, "Rodrigo");
        System.out.println(map.get(3));

        System.out.println("Valores inseridos e map dobrado de tamanho!!");
        mostraMapa(map);

        System.out.println("\nTeste remoção de elemento: ");
        System.out.println("Removendo chave 2 -> "+map.get(2));
        map.remove(2);
        mostraMapa(map);

        System.out.println("\nPesquisando se valor existe na lista");
        System.out.println("Procurando a letra 'A'");
        System.out.println(map.containsValue("Pedro"));
        System.out.println(map.containsValue("Ana"));
        System.out.println(map.containsValue("Carlos"));


        System.out.println("\nEsta vazia? "+map.isEmpty());

        System.out.println("\nLimpando estrutura: ");
        map.clear();
        System.out.println(map.size());
    }


    public static void mostraMapa(meuMap map){
        for(int i = 0; i <= map.size(); i++){
            if (map.get(i) != null){
                System.out.println(i+"° - "+map.get(i));
            }
        }
    }
}
