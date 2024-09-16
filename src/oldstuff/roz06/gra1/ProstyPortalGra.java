package oldstuff.roz06.gra1;

import java.util.ArrayList;

public class ProstyPortalGra {
    public static void main(String[] args) {
        int iloscRuchow = 0; //zmienna okresla ile ruchow wykonal gracz
        //UTWORZ nowy obiekt klasy Portal
        PomocnikGry pomocnik = new PomocnikGry(); //klasa posiada metode pobierajaca dane wejsciowe z konsoli
        Portal portal = new Portal();
        /** KOD PRZYGOTOWYWAWCZY **/
        //WYZNACZ liczbe losowa 0..4 okresla poczatek portalu
        int liczbaLosowa = (int) (Math.random() * 5); //generuje liczbe losowa od 0..4
        //UTWORZ tablice 3 liczb gdzie 1-losowa, 1-losowa+1, 1-losoowa+2 od 0 do 6
        ArrayList<String> polozenie = new ArrayList<>();
        for (int i = 0; i < 3;i++) {
            String liczba = String.valueOf(liczbaLosowa + i);
            polozenie.add(liczba);
        }

        //WYWOLAJ METODE setPolaPolozenia()
        portal.setPolaPolozenia(polozenie); //przekazuje do obiektu Portal jego polozenie w formie tablicy
        //ZADEKLARUJ boolean stan gry czyIstnieje = true;
        boolean czyIstnieje = true; //tworzy zmienno logiczna okreslajaca czy gry wciac powinna sie toczyc, jest uzywana w warunku petli while
        //DOPOKI portal czyIstnieje == true;
        while (czyIstnieje) {
            //POBIERZ dane wejsciowe wpisane przez Gracza
            String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbę: "); //pobieramy łańcuch znakow podany przez gracza
            //SPRAWDZ pole wskazane przez gracza sprawdz();
            String wynik = portal.sprawdz(pole); //prosimy obiekt portal aby sprawdzil pole podane przez gracza
            System.out.print(wynik+"\n");
            //INKREMENTUJ zmienna iloscRuchow++
            iloscRuchow++; //inkrementujemy wartosc zmiennej okreslajacej ilosc ruchow
            //SPRAWDZ czy wynik == "zatopiony"
            if (wynik.equals("zatopiony")) {
                //JESLI TAK to przypisz czyIstnieje = false(petla nie bedzie juz wykonana)
                czyIstnieje = false; //jesli portal zostal zatopiony w metodzie sprawdz to przypisujemy false do czyIstnieje
                //WYSWIETL iloscRuchow gracza
                System.out.print(" w " + iloscRuchow +" "+(iloscRuchow > 1 ? "ruchach" : "ruchu"));
            }
        }
    }
}
