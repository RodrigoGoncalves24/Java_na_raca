package set;

public class testeSet {
    public static void main(String[] args) {
        meuSet set = new meuSet();


        System.out.println("TESTE DO SETLIST");
        set.add(2);
        set.add(5);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(2);

        imprimeSet(set);


    }

    public static void imprimeSet(meuSet set){
        for(int i = 0; i< set.size(); i++){
            System.out.println(i+"° "+set.get(i));
        }
    }
}
