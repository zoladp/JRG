package roz03;

public class KwizGoraProblemow {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        KwizGoraProblemow[] kwz = new KwizGoraProblemow[5];
        while (x < kwz.length) {
            kwz[x] = new KwizGoraProblemow();
            kwz[x].id = x;
            x++;
        }
        kwz[3] = kwz[1];
        kwz[4] = kwz[1];
        kwz[3] = null;
        kwz[4] = kwz[0];
        kwz[0] = kwz[3];
        kwz[3] = kwz[2];
        kwz[2] = kwz[0];
        System.out.println();
    }

}
