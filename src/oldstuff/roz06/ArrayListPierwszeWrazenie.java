package oldstuff.roz06;

import java.util.ArrayList;

public class ArrayListPierwszeWrazenie {
    public static void main(String[] args) {
        ArrayList<Jajko> mojaTbl = new ArrayList<Jajko>();
        Jajko j = new Jajko();
        mojaTbl.add(j);
        Jajko k = new Jajko();
        mojaTbl.add(k);
        int ilosc = mojaTbl.size();
        System.out.println("Ilosc el mojaTble: "+ilosc);
        boolean czyJest = mojaTbl.contains(j);
        System.out.println("Czy jest j: "+czyJest);
        int indeks = mojaTbl.indexOf(k);
        System.out.println("Polozenie k: "+indeks);
        boolean czyPusta = mojaTbl.isEmpty();
        System.out.println("Czy tablica jest pusta: "+czyPusta);
        mojaTbl.remove(j);
        System.out.println(mojaTbl.size());
    }
}
