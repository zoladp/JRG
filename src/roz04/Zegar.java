package roz04;

public class Zegar {
    private String czas;

    public String getCzas() {
        return czas;
    }
    public void setCzas(String czas) {
        this.czas = czas;
    }
}

class ZegarTester {
    public static void main(String[] args) {
        Zegar zegar = new Zegar();
        zegar.setCzas("1234");
        String dta = zegar.getCzas();
        System.out.println("Czas: "+dta);
    }
}
