package oldstuff.roz05.gra;

public class ProstyPortal {
    private int[] polaPolozenia;
    private int iloscTrafien = 0;

    public void setPolaPolozenia(int[] polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }
    public String sprawdz(String stringPole) {
        int strzal = Integer.parseInt(stringPole); //konwersja lancucha znakow na liczbe calkowita
        String wynik = "pudło";
        for (int pole : polaPolozenia) {
            if (strzal == pole) {
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        }
        if (iloscTrafien == polaPolozenia.length) {
            wynik = "trafiony i zatopiony";
        }
        System.out.println(wynik);
        return wynik;
    }
    int getIloscTrafien() {
        return iloscTrafien;
    }
}
