package oldstuff.roz02;

public class OdtwarzaczDVDTester {
    public static void main(String[] args) {
        OdtwarzaczDVD dvd = new OdtwarzaczDVD();
        dvd.mozeNagrywac = true;
        dvd.mozeNagrywac = false;
        dvd.odtworzPlyte();
        dvd.nagrajDVD();
    }
}
