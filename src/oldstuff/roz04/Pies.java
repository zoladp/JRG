package oldstuff.roz04;

public class Pies {
    String imie;
    int wielkosc;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWielkosc(int wielkosc) {
        this.wielkosc = wielkosc;
    }

    public Pies() {
    }

    public Pies(int wielkosc) {
        setWielkosc(wielkosc);
    }

    public Pies(String imie, int wielkosc) {
        this(wielkosc);
        setImie(imie);
    }

    void szczekaj(int razy) {
        while (razy > 0) {
            szczekaj();
            razy--;
        }
    }

    void szczekaj() {
        if (wielkosc > 23)
            System.out.println(imie + " Hou hou...");
        else if (wielkosc > 6)
            System.out.println(imie + " Chau chau...");
        else
            System.out.println(imie + " hiau hiau...");

    }

    int tajnyNumer() {
        return (int) (Math.random()*41)%getClass().hashCode();
    }



}
