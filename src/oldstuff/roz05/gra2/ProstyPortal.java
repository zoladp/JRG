package oldstuff.roz05.gra2;

public class ProstyPortal {
    int[] polaPolozenia;
    int iloscTrafien;

    public void setPolaPolozenia(int[] ppol) {
        polaPolozenia = ppol;
    }

    public String sprawdz(String stringPole) {
        String wynik = "pudło";
        int strzal;
        try {
            strzal = Integer.parseInt(stringPole);
        } catch (NumberFormatException e) {
            wynik += "! Podaj cyfre a nie litere!";
            strzal = -1;
        }
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
        //System.out.println(wynik);
        return wynik;
    }
}
