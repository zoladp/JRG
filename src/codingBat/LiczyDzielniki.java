package codingBat;

import java.util.ArrayList;
import java.util.List;

public class LiczyDzielniki {
    static int c;
    //Liczby pierwsze
    public static void main(String[] args) {
        List<String> sb = new ArrayList<>();
        for (int i = 2000; i < 100000; i++) {
            int dzielnik = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    dzielnik++;
            }
            if (dzielnik > 99)
                sb.add(i+": "+dzielnik);
        }

        for (String i : sb) {
            System.out.print(i+" \t\t"); c++;
            if(c%10==0) System.out.println("\n");
        }
        System.out.println("\n\nliczby z najwieksza iloscia dzielnikow: "+sb.size());
    }

}
