package roz02;

public class MagnetofTester {
    public static void main(String[] args) {
        Magnetofon magnetofon = new Magnetofon(1);
        magnetofon.odtworzTasme();
        magnetofon.nagrywajTasme();

        int[] liczby;
        liczby = new int[3];

        int[][] licz2w = new int[4][6];
        int[][][] licz3w = new int[2][4][6];
        licz3w[1][2][4] = 13;

        Integer[] liczbyInt = new Integer[4];

        double[] liczbydbl1 = new double[6];
        Double[] liczbyDbl2 = new Double[6];

        short[] lShortytab = new short[5];

        boolean[] boolTab = new boolean[11];

        String[] orgs = new String[4];

        float[] floattab = new float[7];

        char[] charTab = new char[9];
        Character[] charTab2 = new Character[9];

        Magnetofon[] magnetofonsTab = new Magnetofon[4];
        magnetofonsTab[0] = new Magnetofon(0);
        magnetofonsTab[0].odtworzTasme();
        magnetofonsTab[0].nagrywajTasme();

        int zwyklaInt = 1;
        int zwyklaInt2;
        int zwyklaInt3 = '3';
        String zwyklyStirng = new String("jakis teksts");
        String zwyklyStirng2 = "jakis teksts2ę";
        char[] zwyklyChar2 = zwyklyStirng2.toCharArray();
        String stringzChar = zwyklyChar2.toString();
        System.out.println(stringzChar);
        char zwyklyChar = 3;
        char zwyklyChar3;
        char zwyklyChar4 = 'ę';
        boolean bool1 = true;







    }

}
