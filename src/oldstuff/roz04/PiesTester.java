package oldstuff.roz04;

public class PiesTester {
    public static void main(String[] args) {
        Pies[] zwierzaki = new Pies[3];
        zwierzaki[0] = new Pies();
        zwierzaki[1] = new Pies("Piesełek",3);
        zwierzaki[2] = new Pies(9);

        zwierzaki[0].imie = "Burek";
        zwierzaki[0].wielkosc = 30;
        zwierzaki[1].wielkosc = 3;
        zwierzaki[2].imie = "Azor";
        zwierzaki[0].szczekaj(2);
        zwierzaki[1].szczekaj();
        zwierzaki[2].szczekaj(5);

        Pies wyrzel = new Pies("Horvath", 6);
        wyrzel.szczekaj();
        System.out.println("Tajny nr: "+wyrzel.tajnyNumer());
        System.out.println(zwierzaki[1].tajnyNumer());

        Pies[] shitsu = new Pies[4]; //tutaj tylko rezerwujemy pamiec
        shitsu[0] = new Pies();
        shitsu[0].imie = "jamijami";
        shitsu[0].wielkosc = 33;
        shitsu[0].szczekaj(5);
        shitsu[3] = new Pies("hoihoi",19);
        shitsu[3].szczekaj(2);

        Pies[] owczarek = {new Pies(4),new Pies("Ciapek",33)};
        owczarek[0].szczekaj();
        owczarek[1].szczekaj();

        int[] liczby;
        liczby = new int[3];
        liczby[0] = 6;
        liczby[1] = 11;
        liczby[2] = 1;

        Pies[] zwierz = new Pies[3];
        zwierz[0] = new Pies();
        zwierz[1] = new Pies();
        zwierz[2] = new Pies("Buruś",18);
        zwierz[2].szczekaj();
    }
}
