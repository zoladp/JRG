package codingBat;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class IntMaxStream {
    public static void main(String[] args) {
        intMax(1,2,3);
        intMax(1,3,2);
        intMax(3,2,1);
        intMax(0,0,-1);
    }

    public static void intMax(int a, int b, int c) {
        List<Integer> list = Arrays.asList(a, b, c);
        Integer max = list.stream().mapToInt(x -> x)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println("intMax("+a+","+b+","+c+"): "+max);
    }
}
