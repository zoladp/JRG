package oldstuff.roz07.zwierz;

public class Zwierze {
    String zdjecie;
    String pozywienie;
    int glod;
    String terytorium;
    String polozenie;

     public void halasuj() {
        System.out.println("Zwierze halasuje");
    }

    public void jedz() {
        System.out.println("Zwierze je");
    }

     void spij() {
        //czynnosc kiedy zwierze ma spac
         System.out.println("Zwierze spi");
    }

    public void wedruj() {
        //czynnosc wykonywana kiedy zwierze ani je ani nie spi, przemieszcza sie po swoim terytorium
        //oczekujac na spotkanie ze zrodlem pozywienia
        System.out.println("Zwierze wedruje...");
    }
}
