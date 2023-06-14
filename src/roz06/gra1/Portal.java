package roz06.gra1;

import java.util.ArrayList;

public class Portal {
    ArrayList<String> polaPolozenia;

    public void setPolaPolozenia(ArrayList<String> ppol) {
        polaPolozenia = ppol;
    }

    public String sprawdz(String ruch) {
        String wynik = "pudło";

        int indeks = polaPolozenia.indexOf(ruch); //jesli pola nie bedzie to zwroci -1
        if (indeks >= 0) {
            polaPolozenia.remove(indeks); //jesli znajdzie to usunie
            if (polaPolozenia.isEmpty()) {
                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    }
}
