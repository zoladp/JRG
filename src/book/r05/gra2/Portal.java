package book.r05.gra2;

import java.util.Arrays;
import java.util.Scanner;

public class Portal {

    int[] polaUstawione;
    int[] polaWprowadzone;
    int iloscTrafien;
    int iloscProb;

    public Portal() {
        ustawPola();
        System.out.println(Arrays.toString(polaUstawione));
    }

    public Portal gra() {
        System.out.println("Podaj na ktorym miejscu jest portal [1..4]");
        sprawdz();
        podsumowanie();
        return this;
    }

    private void sprawdz() {
        Scanner scanner = new Scanner(System.in);
        polaWprowadzone = new int[polaUstawione.length];
        for(int i = 0; i<polaUstawione.length; i++) {
            polaWprowadzone[i] = scanner.nextInt();
            if(polaWprowadzone[i]==polaUstawione[i]) {
                iloscTrafien++;
                System.out.println("Trafiony po raz " + iloscTrafien);
            } else {
                System.out.println("Pudło");
            }
            iloscProb++;
        }
    }

    private void podsumowanie() {
        String wynik;
        if(iloscTrafien==polaUstawione.length) {
            wynik = "Portal trafiony i zatopiony, w " + iloscProb + " krokach";
        } else {
            wynik = "Portal ciągle pływa, ilosc trafień "+iloscTrafien+", a ilość prób to "+ iloscProb;
        }
        System.out.println(wynik);
    }

    private int[] losuj() {
        int x = (int) (Math.random() * 3) + 1;
        return new int[] {x, x + 1, x + 2};
    }

    private void ustawPola(int[] polaUstawione) {
        this.polaUstawione = polaUstawione;
    }

    private void ustawPola() {
        this.polaUstawione = losuj();
    }

}
