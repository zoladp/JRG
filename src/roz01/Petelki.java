package roz01;

public class Petelki {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Przed wykonaniem petli");
        while (x < 4) {
            System.out.println("Wewnatrz petli");
            System.out.println("Wartosc x = " + x);
            x = x +1;
        }
    }
}
