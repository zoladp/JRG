package oldstuff.roz04;

public class Mix4 {
    private int licznik = 0;

    public static void main(String[] args) {
        Mix4 mm = new Mix4();
        mm.metoda(9, 5);
        mm.metoda(20, 5);
        mm.metoda(7, 7);
        mm.metoda(19, 1);
    }

    public void metoda(int length, int end) {
        int ilosc = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while (x < length) {
            m4a[x] = new Mix4();
            m4a[x].licznik = m4a[x].licznik + 1;
            ilosc++;
            ilosc = ilosc + m4a[x].mozeNowa(x, end);
            x++;
        }
        System.out.println(ilosc + " " + m4a[1].licznik);
    }

    public int mozeNowa(int indeks, int end) {
        if (indeks < end) {
            Mix4 m4 = new Mix4();
            m4.licznik = m4.licznik + 1;
            return 1;
        }
        return 0;
    }
}
