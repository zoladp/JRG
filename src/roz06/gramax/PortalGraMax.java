package roz06.gramax;

import java.util.ArrayList;

public class PortalGraMax {
    //ZADANIA przygotować, prowadzić, zakończyć rozgrywkę
    //Tworzy obiekt Portal
    //Pobiera dane wprow. przez Gracza
    //Prowadzi gre az do momentu gdy wszystkie portale zostana zatopione

    //Zmienne pola
    private int iloscRuchow = 0;
    private PomocnikGry pomocnik = new PomocnikGry();
    private ArrayList<Portal> listaPortali = new ArrayList<>();

    //Metody
    public void przygotujGre() {
        //Tworzy obiekty Portal i okresla ich nazwy
        Portal portal1 = new Portal();
        portal1.setNazwa("onet.pl");
        Portal portal2 = new Portal();
        portal2.setNazwa("wp.com");
        Portal portal3 = new Portal();
        portal3.setNazwa("Go2.com");
        listaPortali.add(portal1);
        listaPortali.add(portal2);
        listaPortali.add(portal3);
        //Wyswietla krotkie instrukcje dla gracza
        System.out.println("Twoim celem jest zatopienie trzech portali.");
        System.out.println("onet.pl, wp.pl, Go2.com");
        System.out.println("Postaraj się je zatopić w jak najmniejszej ilości ruchów.");

        //Dodaj polozenie na planszy
        for (Portal rozmieszczanyPortal : listaPortali) {
            ArrayList<String> nowePolozenie = pomocnik.rozmiescPortal(3);
            rozmieszczanyPortal.setPolaPolozenie(nowePolozenie);
        }
    }

    public void rozpocznijGre() {
        //Prosi gracza o podanie wpolz ruchu
        //wywoluje sprawdzRuchGracz() az do momentu kiedy wszystkie portale sa usuniete z gry
        while (!listaPortali.isEmpty()) {
            String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj pole:");
            sprawdzRuchGracza(ruchGracza);
        }
        zakonczGre();
    }

    public void sprawdzRuchGracza(String ruch) {
        //wywoluje sprawdz() wszystkich pozostajacych w grze portali
        iloscRuchow++;
        String wynik = "pudło";
        for (Portal portalDoSprawdzenia : listaPortali) {
            wynik = portalDoSprawdzenia.sprawdz(ruch);
            if (wynik.equals("trafiony")) {
                //wynik = "trafiony";
                break;
            }
            if (wynik.equals("zatopiony")) {
                listaPortali.remove(portalDoSprawdzenia); //usuwamy zatopiony portal
                //wynik = "zatopiony";
                break;
            }
        }
        System.out.println(wynik);
    }

    public void zakonczGre() {
        //na podstawie iloscRuchow wyswietla komunikat o wynikach gracza
        System.out.print("Wszystkie portale zostały zatopione. Gra została zakończona.");
        if (iloscRuchow < 12) {
            System.out.println("Wykonałes jedynie " + iloscRuchow + " ruchów.");
        } else
            System.out.println(" Ale się grzebałes! Wykonałeś aż" + iloscRuchow + " ruchów.");
    }

    public static void main(String[] args) {
        PortalGraMax gra = new PortalGraMax();
        gra.przygotujGre();
        gra.rozpocznijGre();
    }
}
