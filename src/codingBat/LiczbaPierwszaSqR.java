package codingBat;

public class LiczbaPierwszaSqR {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            if (czyPierwsza(i)) sb.append(i + " lp\n");
        }
        System.out.println(sb);
    }

    static boolean czyPierwsza(int a) {
        if (a <= 2) return false;
        int i = 2;
        double sqr = Math.sqrt(a);
        while (i<=sqr) {
            if(a%i==0) return false;
            i++;
        }
        return true;


//        for (int i = 2; i <= Math.sqrt(a); i++)
//            if (a % i == 0) return false;
//        return true;
    }
}
