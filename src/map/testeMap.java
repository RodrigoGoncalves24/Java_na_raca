package map;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class testeMap {
    public static void main(String[] args) {
        meuMap<Integer, String> mapIntStrg = new meuMap();
        Random rand = new Random();


        List<String> nomes = Arrays.asList("Ana", "Bia", "Carlos", "Diogo", "Edu", "Fabiana", "Gustavo");
        System.out.println("************ TESTE MAP ************");
        System.out.println("Inserindo valor:");
        mapIntStrg.put(1, "Rodrigo");
        System.out.println("Pegando valores: "+mapIntStrg.get(1));
        mapIntStrg.put(2, "Leonardo");
        System.out.println("Pegando valores: "+mapIntStrg.get(2));
        System.out.println("\nVerificando se a chave 2 existe no mapa: "+mapIntStrg.containsKey(2));

        System.out.println("\nInserindo valores");
        for(int i = 0; i<10; i++){
            mapIntStrg.put(i, nomes.get(rand.nextInt(0, 7)));
        }

        System.out.println("Teste trocando elementos: Trocando elemento 3 -> "+mapIntStrg.get(3));
        mapIntStrg.put(3, "Rodrigo");
        System.out.println(mapIntStrg.get(3));

        System.out.println("Valores inseridos e map dobrado de tamanho!!");
        mapIntStrg.print();

        System.out.println("\nTeste remoção de elemento: ");
        System.out.println("Removendo chave 2 -> "+mapIntStrg.get(2));
        mapIntStrg.remove(2);
        mapIntStrg.print();

        System.out.println("\nPesquisando se valor existe na lista");
        System.out.println("Procurando a letra 'A'");
        System.out.println(mapIntStrg.containsValue("Pedro"));
        System.out.println(mapIntStrg.containsValue("Ana"));
        System.out.println(mapIntStrg.containsValue("Carlos"));


        System.out.println("\nEsta vazia? "+mapIntStrg.isEmpty());

        System.out.println("\nLimpando estrutura: ");
        mapIntStrg.clear();
        System.out.println(mapIntStrg.size());

        System.out.println("\nTestando mapa genérico");

        System.out.println("\nMapa só de String");
        meuMap<String, String> mapStr = new meuMap();
        mapStr.put("A", "B");
        mapStr.put("R", "L");
        mapStr.print();

        System.out.println("\nMapa só de inteiro");
        meuMap<Integer, Integer> mapInt = new meuMap();
        mapInt.put(5, 6);
        mapInt.put(8, 2);
        mapInt.print();

        System.out.println("\nMapa de String para chave e número para valores");
        meuMap<String, Integer> mapStrInt = new meuMap();
        mapStrInt.put("A", 6);
        mapStrInt.put("R", 2);
        mapStrInt.print();

    }


}
