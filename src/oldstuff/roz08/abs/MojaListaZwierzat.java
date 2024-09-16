package oldstuff.roz08.abs;

public class MojaListaZwierzat {
    private Zwierze[] zwierzeta = new Zwierze[5];
    private int nastepnyIndx;

    public void dodaj(Zwierze z) {
        if (nastepnyIndx < zwierzeta.length) {
            zwierzeta[nastepnyIndx] = z;
            System.out.println("Zwierze dodano na pozycji nr " + nastepnyIndx);
            nastepnyIndx++;
        }
    }

    public Zwierze getZwierze(int i) {
        return zwierzeta[i];
    }
}

class ListaZwierzatTester {
    public static void main(String[] args) {
        MojaListaZwierzat listaZwierzat = new MojaListaZwierzat();
        Pies pies = new Pies();
        Kot kot = new Kot();
        listaZwierzat.dodaj(pies);
        listaZwierzat.dodaj(kot);
        listaZwierzat.getZwierze(0).wedruj();
        listaZwierzat.getZwierze(1).jedz();
        listaZwierzat.getZwierze(0).spij();
    }
}