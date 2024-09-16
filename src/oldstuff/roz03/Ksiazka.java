package oldstuff.roz03;

import java.util.Random;

public class Ksiazka {
    String tytul;
    String autor;
}

class KsiazkaTester {
    public static void main(String[] args) {
        int x = Integer.parseInt(String.valueOf(args[0]));
        Ksiazka[] mojeKsiazki = new Ksiazka[x];
        for (int i = 0; i < x; i++) {
            mojeKsiazki[i] = new Ksiazka();
            mojeKsiazki[i].tytul = randomString(random(10));
            mojeKsiazki[i].autor = randomString(random(20));
        }

        while (x > 0) {
            x--;
            System.out.print(x+" tytuł: '"+mojeKsiazki[x].tytul);
            System.out.print("' \t\t\tautor: ");
            System.out.println(mojeKsiazki[x].autor);
        }
    }

    private static String randomString(int length) {
        int leftlimit = 97; //letter 'a'
        int rightLimit = 122; //letter 'z'
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = leftlimit + (int)(random.nextFloat() * (rightLimit - leftlimit + 1));
            sb.append((char)randomLimitedInt);
        }
        return capital1st(sb.toString());
    }

    private static int random(int length) {
        return (int)(Math.random() * length+2);
    }

    private static String capital1st(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
