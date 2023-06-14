package codingBat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PorownajListy {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 9, 3, 4, 5);
        List<Integer> lista2 = Arrays.asList(1, 2, 3, 7, 5, 6,8);
        porwnajListy(lista1, lista2);
    }

    public static void porwnajListy(List<Integer> l1, List<Integer> l2) {
        List<Integer> roznice12 = l1.stream().filter(elem -> !l2.contains(elem)).collect(Collectors.toList());
        System.out.println("lista1 do lista2: "+Arrays.toString(roznice12.toArray()));
        List<Integer> roznice21 = l2.stream().filter(elem -> !l1.contains(elem)).collect(Collectors.toList());
        System.out.println("lista2 do lista1: "+Arrays.toString(roznice21.toArray()));
    }

}
