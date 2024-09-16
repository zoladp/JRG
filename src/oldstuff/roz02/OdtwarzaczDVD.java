package oldstuff.roz02;

public class OdtwarzaczDVD {
    boolean mozeNagrywac;

    void odtworzPlyte() {
        System.out.println("Odtwarzam DVD");
    }

    void nagrajDVD() {
        if (mozeNagrywac == true)
            System.out.println("Nagrywam DVD");
        else
            System.out.println("Nagrywanie Blocked");
    }
}
