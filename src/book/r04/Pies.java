package book.r04;

public class Pies {
    int wielkosc;
    String imie;

    void szczekaj() {
        if(wielkosc>23) {
            System.out.println("Houu! Houu!");
        } else if(wielkosc>6) {
            System.out.println("Chau! Chau!");
        } else {
            System.out.println("Hiau Hiau");
        }

        
    }
}

class Tester {
    public static void main(String[] args) {
        Pies pies = new Pies();
        pies.szczekaj();
        Pies pies2 = new Pies();
        pies2.wielkosc = 25;
        pies2.szczekaj();
    }
}
