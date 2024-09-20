package book.r05.gra1;

import java.util.Scanner;

public class ProstyPortal {

    int[] polaPolozenia;
    int iloscTrafien;
    String wynik;

    public void gra() {
        int[] polozenia = losuj();
        setPolaPolozenia(polozenia);
        System.out.print("Podaj "+polozenia.length+" pola położenia portalu [1..4]\n");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< polozenia.length;i++) {
            String wybranePole = sc.nextLine();
            wynik = sprawdz(wybranePole);
        }
        System.out.println(wynik);
    }

    private String sprawdz(String stringPole) {
        int strzal = Integer.parseInt(stringPole); //konwersja lancucha na liczbe calkowita
        String wynik = "pudło";

        for (int pole : polaPolozenia) {
            if(strzal == pole) {
                iloscTrafien++;
            }
        }

        if(iloscTrafien == polaPolozenia.length) {
            wynik = "trafiony i definitywnie zatopiony";
        } else if(iloscTrafien==0) {
            wynik = "trafiony i pływa jak chce";
        } else {
            wynik = "trafiony, ale jeszcze pływa";
        }
        return iloscTrafien+(iloscTrafien!=1?" razy":" raz")+" "+wynik;
    }

    private void setPolaPolozenia(int[] polozenia) {
        this.polaPolozenia = polozenia;
    }

    public int[] losuj() {
        int x = (int) (Math.random()*4+1);
        return new int[]{x, x+1, x+2};
    }
}
