package oldstuff.roz03;

public class Metody {
    public static void main(String[] args) {
        Metody m = new Metody();
        byte h = (byte)m.obliczPole(4,5);
        System.out.println(h);

        int g =obliczPole(3,4);
        long lt = 42;

        long obpl = obliczPole((int) lt,5);

    }

    static int obliczPole(int wys, int szer) {
        return wys * szer;
    }
}
