package roz04;

public class DobryPiesek {
    private int wielkosc;

    public DobryPiesek() {
    }

    public DobryPiesek(int wielkosc) {
        this.wielkosc = wielkosc;
    }
    public int getWielkosc() {
        return wielkosc;
    }


    public void setWielkosc(int wielkosc) {
        this.wielkosc = wielkosc;
    }

    void szczekaj() {
        if (wielkosc > 23) {
            System.out.println("Houuu Houuu!");
        } else if (wielkosc > 6) {
            System.out.println("Chau! Chau!");
        } else {
            System.out.println("Hiauu, hiauuu!");
        }
    }
    public void matedo(int x) {
        x = 5;
        System.out.println(x);
    }
}

class DobryPiesekTester {
    public static void main(String[] args) {
        DobryPiesek pierwszy = new DobryPiesek();
        pierwszy.setWielkosc(70);
        DobryPiesek drugi = new DobryPiesek();
        drugi.setWielkosc(8);
        System.out.println("Pierwszy Pies: " + pierwszy.getWielkosc());
        System.out.println("Drugi Pies; " + drugi.getWielkosc());
        pierwszy.szczekaj();
        drugi.szczekaj();

        DobryPiesek[] zwierzaki;
        zwierzaki = new DobryPiesek[2];
        zwierzaki[0] = new DobryPiesek(22);
        zwierzaki[1] = new DobryPiesek(24);
        for (DobryPiesek dobryPiesek : zwierzaki) {
            int length = zwierzaki.length;
            System.out.println(length);
        }
        for (int i = 0; i < zwierzaki.length; i++) {
            System.out.println(zwierzaki[i].getWielkosc());
            zwierzaki[i].szczekaj();
        }
        drugi.matedo(1);
    }
}
