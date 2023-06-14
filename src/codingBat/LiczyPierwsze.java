package codingBat;

import java.util.ArrayList;
import java.util.List;

public class LiczyPierwsze {
    static int c;
    //Liczby pierwsze
    public static void main(String[] args) {
        //        int count = 0;
        //        for (int i = 2; i < 270; i++) {
        //            int flag = 0;
        //            for (int j = 2; j < i; j++) {
        //                if (i % j == 0) flag++;
        //            }
        //            if (flag == 0) { System.out.print(i + "\t"); count++;}
        //            if(count%20==0) System.out.println();
        //        }
        List<Integer> sb = new ArrayList<>();
        for (int i = 2; i < 1010; i++) {
            int dzielnik = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    dzielnik++;
            }
            if (dzielnik == 0)
                sb.add(i);
        }

        for (Integer i : sb) {
            System.out.print(i+" \t\t"); c++;
            if(c%15==0) System.out.println("\n");
        }
        System.out.println("\n\nilosc liczb pierwszych: "+sb.size());
    }

}
