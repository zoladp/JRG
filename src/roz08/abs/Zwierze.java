package roz08.abs;

abstract public class Zwierze {
    String zdjecie;
    String pozywienie;
    int glod;
    String terytorium;
    String polozenie;

    abstract void halasuj();

    void jedz() {
        System.out.println("Zwierze je");
    }
    void wedruj() {
        System.out.println("Zwierze wedruje");
    }
    abstract void spij();
}
