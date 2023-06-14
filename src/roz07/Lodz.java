package roz07;

public class Lodz {
    private int dlugosc;
    public void setDlugosc(int dl) {
        dlugosc = dl;
    }
    public int getDlugosc() {
        return dlugosc;
    }
    public void plyn() {
        System.out.println("dryfuje");
    }
}

class LodzWioslowa extends Lodz {
       public void wioslowanie() {
           System.out.println("wiosłuj Natasza");
       }
}

class LodzZaglowa extends Lodz {
    public void plyn() {
        System.out.println("stawiać żagle");
    }
}

class TestLodzi {
    public static void main(String[] args) {
        Lodz b1 = new Lodz();
        LodzZaglowa b2 = new LodzZaglowa();
        LodzWioslowa b3 = new LodzWioslowa();
        b2.setDlugosc(32);
        b1.plyn();
        b3.plyn();
        b2.plyn();
    }
}

