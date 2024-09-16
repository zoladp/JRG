package oldstuff.roz02.gra;

public class Zgadywanka {
    Gracz p1;
    Gracz p2;
    Gracz p3;

    static int ileGier;

    public void rozpocznijGre() {
        p1 = new Gracz();
        p2 = new Gracz();
        p3 = new Gracz();

        int typp1 = 0;
        int typp2 = 0;
        int typp3 = 0;

        //flagi
        boolean p1odgadl = false;
        boolean p2odgadl = false;
        boolean p3odgadl = false;

        int counter = 1;
        ileGier++;

        int liczbaOdgadywana = (int) (Math.random() * 20);
        System.out.println("Myśle o liczbie z zakresu od 0 do 9...");

        while (true) {
            p1odgadl = false;
            p2odgadl = false;
            p3odgadl = false;

            System.out.println("---=============================---\n\nNależy wytypować liczbę: " + liczbaOdgadywana);
            p1.zgaduj();
            p2.zgaduj();
            p3.zgaduj();

            typp1 = p1.liczba;
            System.out.println("Gracz 1 wytypowal liczbe: " + typp1);
            typp2 = p2.liczba;
            System.out.println("Gracz 2 wytypowal liczbe: " + typp2);
            typp3 = p3.liczba;
            System.out.println("Gracz 3 wytypowal liczbe: " + typp3);

            if (typp1 == liczbaOdgadywana) p1odgadl = true;
            if (typp2 == liczbaOdgadywana) p2odgadl = true;
            if (typp3 == liczbaOdgadywana) p3odgadl = true;

            if (p1odgadl & p2odgadl & p3odgadl) {
                System.out.println("Mamy zwyciezcę!");
                System.out.println("Czy Gracz.1 wytypowal poprawnie? " + p1odgadl);
                System.out.println("Czy Gracz.2 wytypowal poprawnie? " + p2odgadl);
                System.out.println("Czy Gracz.3 wytypowal poprawnie? " + p3odgadl);
                System.out.println("Koniec gry.");
                break; //it breaks the loop while
            } else {
                System.out.println("Gracze spróbuje jeszcze raz szczęscia w losowaniu...\n");
            }
            counter++;
            System.out.println("--> Próba: " + counter);
        }
        System.out.println("Ilosc prób: " + counter);
        System.out.println("Ilosc gier: " + ileGier);
    }
}
