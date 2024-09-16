package oldstuff.roz02.gra;

public class Gracz {
    int liczba;

    public void zgaduj() {
        liczba = (int) (Math.random() * 20);
        System.out.println("Typuje liczbę: " +liczba);
    }
}
