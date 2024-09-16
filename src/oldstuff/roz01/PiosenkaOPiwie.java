package oldstuff.roz01;

public class PiosenkaOPiwie {
    public static void main(String[] args) {
        int iloscButelek = 9;
        String slowo = "butelek";
        while (iloscButelek > 0) {
            if (iloscButelek < 5)
                slowo = "butelki";
            if (iloscButelek == 1)
                slowo = "butelka";
            System.out.println(iloscButelek +" "+ slowo +" na scianie");
            System.out.println(iloscButelek+" "+ slowo +" piwa.");
            System.out.println("Zabierz jedna");
            System.out.println("Podaj dalej");
            iloscButelek -= 1;
            if(iloscButelek == 0)
                System.out.println("Nie ma wiecej butelek na scianie");
        }
    }
}
