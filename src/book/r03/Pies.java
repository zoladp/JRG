package book.r03;

public class Pies {
    String imie;


    public static void main(String[] args) {
        Pies pies1 = new Pies();
        pies1.imie = "Azorek";
        pies1.szczekaj();


        Pies[] mojePsy = new Pies[3];
        mojePsy[0] = new Pies();
        mojePsy[1] = new Pies();
        mojePsy[2] = pies1;

        mojePsy[0].imie = "Szarik";
        mojePsy[1].imie = "Cywil";

        System.out.println("Ostatni pies ma na imie " + mojePsy[2].imie);

        int x = 0;
        while(x < mojePsy.length) {
            mojePsy[x].szczekaj();
            x++;
        }
    }


    public void szczekaj() {
        System.out.println(this.imie + " sczeka: Hau, hauu!");
    }
}
