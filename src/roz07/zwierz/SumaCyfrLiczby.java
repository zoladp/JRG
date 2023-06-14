package roz07.zwierz;

public class SumaCyfrLiczby {
    public static void main(String[] args) {
        suma(758567);
        suma(2);
        suma(0);
        suma(11111);
        suma(999900595609890899L);
    }

    static long suma(long n) {
        int suma = 0;
        while (n > 0) {
            long m = n % 10;
            suma += m;
            System.out.print(m);
            n = n / 10;
            if (n > 0) System.out.print(" + ");
        }
        System.out.println(" = "+suma);
        return suma;
    }
}
