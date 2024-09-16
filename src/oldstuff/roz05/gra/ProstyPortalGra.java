package oldstuff.roz05.gra;

import java.io.IOException;

public class ProstyPortalGra {

    public static void main(String[] args) throws IOException {
        int iloscRuchow = 0;
        PomocnikGry pomocnik = new PomocnikGry();
        ProstyPortal portal = new ProstyPortal();
        int liczbaLosowa = (int) (Math.random() * 5); //losuje liczbe od 0..4
        int[] polozeniePortalu = {liczbaLosowa, liczbaLosowa + 1, liczbaLosowa + 2};
        portal.setPolaPolozenia(polozeniePortalu);

        boolean czyIstnieje = true;
        while (czyIstnieje == true) {
            String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbe: ");
            String wynik = portal.sprawdz(pole);
            iloscRuchow++;
            if (wynik.equals("trafiony i zatopiony")) {
                czyIstnieje = false;
                switch (iloscRuchow) {
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("w " + iloscRuchow + " ruchach.");
                        break;
                    default:
                        System.out.println("we " + iloscRuchow + " ruchów.");
                        break;
                }

            }
        }
    }
}
