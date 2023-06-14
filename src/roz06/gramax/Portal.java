package roz06.gramax;

import java.util.ArrayList;

public class Portal {
    //OBIEKTY Portal znaja swoja nazwe i położenie
    //WIE jak sprawdz. czy Gracz trafil w zajmow. przez nie pole

    private String nazwa;
    private ArrayList<String> polaPolozenie;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPolaPolozenie(ArrayList<String> polaPolozenie) {
        this.polaPolozenie = polaPolozenie;
    }

    public String sprawdz(String ruch) {
        String wynik = "pudło";
        int indeks = polaPolozenie.indexOf(ruch); //jesli nie ma to zwroci -1;
        if (indeks > -1) {
            polaPolozenie.remove(ruch);
            if (polaPolozenie.isEmpty()) {
                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    }

}
