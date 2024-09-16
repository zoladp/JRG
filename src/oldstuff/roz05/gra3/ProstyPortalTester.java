package oldstuff.roz05.gra3;

import oldstuff.roz05.gra2.ProstyPortal;

public class ProstyPortalTester {
    public static void main(String[] args) {
        ProstyPortal wit = new ProstyPortal();
        int[] polozenia = {2, 3, 4};
        wit.setPolaPolozenia(polozenia);
        String wybranePola = "1";
        String wynik = wit.sprawdz(wybranePola);
        System.out.println(wynik);
    }
}
