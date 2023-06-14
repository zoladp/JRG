package roz05;

public class Rsa {
    public static void main(String[] args) {
        long j;
        j = (long) Math.pow(142, 23);
        System.out.println(j);
        long w = j%187;
        System.out.println(w);

        Rsa rsa = new Rsa();
        int i = rsa.hashCode();
        System.out.println(i);
    }
}
