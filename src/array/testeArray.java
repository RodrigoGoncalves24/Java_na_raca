package array;

public class testeArray {
    public static void main(String[] args) throws Exception {
        meuArray array = new meuArray();

        // add elements
        array.add(6);
        array.add(10);
        array.add(9);
        array.add(56);
        array.add(-2);
        array.add(10);
        array.add(-5);

        System.out.println("Primeiro elemento com getFirst(): "+array.getFirst());
        System.out.println("Segundo elemento: "+array.get(1));
        System.out.println("Tamanho do array: "+array.size());

        // test to get an element
        System.out.println("\nElementos do array:");
        for(int i = 0; i< array.size(); i++){
            System.out.println(i +"° "+array.get(i));
        }

        System.out.println("\nAcessando posição que não existe (negativa): "+array.get(-2));
        System.out.println("Acessando posição que não existe (maior que o array): "+array.get(100));


        System.out.println("\nRemovendo elementos: ");
        array.remove(4);
        for(int i = 0; i< array.size(); i++){
            System.out.println(i+"° "+array.get(i));
        }
        System.out.println("Tamanho do array: "+array.size());

        array.remove(2);

        for(int i = 0; i< array.size(); i++){
            System.out.println(i+"° "+array.get(i));
        }
        System.out.println("Tamanho do array: "+array.size());


    }


}
