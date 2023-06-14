package roz03;

public class Zegar {
    String czas;

    void setCzas(String czas) {
        this.czas = czas;
    }

    String getCzas() {
        return czas;
    }

}

class ZegarTester {
    public static void main(String[] args) {
        Zegar z = new Zegar();
        z.setCzas("12:00");
        System.out.println(z.getCzas());
    }
}
