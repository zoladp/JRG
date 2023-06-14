package roz02;

public class Magnetofon {
    boolean mozeNagrywac;

    Magnetofon(int flaga) {
        if (flaga > 0)
            mozeNagrywac = true;
        else mozeNagrywac = false;
    }

    void odtworzTasme() {
        System.out.println("odtwarzam tasme");
    }

    void nagrywajTasme() {
        if (mozeNagrywac == true)
            System.out.println("nagrywam tasme");
        else
            System.out.println("nagrywanie blokowane");
    }
}
