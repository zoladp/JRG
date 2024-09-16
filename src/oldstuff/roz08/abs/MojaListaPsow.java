package oldstuff.roz08.abs;

public class MojaListaPsow {
    private Pies[] psy = new Pies[5];
    private int nastepnyIndx = 0;

    public void dodaj(Pies p) {
        if (nastepnyIndx < psy.length) {
            psy[nastepnyIndx] = p;
            System.out.println("Pies dodany na pozycji nr " + nastepnyIndx);
            //System.out.println(" o nazwie '" + psy[nastepnyIndx].getName() + "'");
            nastepnyIndx++;
        }
    }

    public void wyswietl() {
        for (int i = 0; i < psy.length; i++) {
            System.out.print(psy[i].getName() + (i < psy.length - 1 ? ", " : "."));
        }
    }
}

class ListaPsowTester {
    public static void main(String[] args) {
        MojaListaPsow listaPsow = new MojaListaPsow();
        Pies burek = new Pies("Burek");
        Pies azorek = new Pies("Azorek");
        Pies badziorek = new Pies("Badziorek");
        Pies koltun = new Pies("Kołtun");
        Pies kitaj = new Pies("Kitaj");
        Pies szostek = new Pies("Szustek");

        listaPsow.dodaj(burek);
        listaPsow.dodaj(azorek);
        listaPsow.dodaj(badziorek);
        listaPsow.dodaj(koltun);
        listaPsow.dodaj(kitaj);
        listaPsow.dodaj(szostek);

        listaPsow.wyswietl();
    }
}