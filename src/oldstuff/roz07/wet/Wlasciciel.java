package oldstuff.roz07.wet;

import oldstuff.roz07.zwierz.Hipopotam;
import oldstuff.roz07.zwierz.Pies;
import oldstuff.roz07.zwierz.Tygrys;
import oldstuff.roz07.zwierz.Zwierze;

public class Wlasciciel {
    public void start() {
        Pies p = new Pies();
        Hipopotam h = new Hipopotam();
        Weterynarz w = new Weterynarz();
        w.zrobZastrzyk(p);
        w.zrobZastrzyk(h);
    }

    public static void main(String[] args) {
        Wlasciciel wlasciciel = new Wlasciciel();
        wlasciciel.start();

        Zwierze tygrys = new Tygrys();
        Weterynarz weterynarz = new Weterynarz();
        weterynarz.zrobZastrzyk(tygrys);
    }
}
