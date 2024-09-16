package oldstuff.roz07.lekarz;

public class LekarzTester {
    public static void main(String[] args) {
        LekarzRodzinny lekarzRodzinny = new LekarzRodzinny();
        lekarzRodzinny.pracujeWSzpitalu = false;
        lekarzRodzinny.prowadziWizytyDomowe = true;
        lekarzRodzinny.podajjPorade();
        lekarzRodzinny.leczPacjenta();

        Chirurg chirurg = new Chirurg();
        chirurg.pracujeWSzpitalu = true;
        chirurg.zrobNaciecie();

        Lekarz chir2 = new Chirurg();
        ((Chirurg) chir2).zrobNaciecie();


    }
}
