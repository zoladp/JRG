package farma;

public class Krowa extends Zwierze {
    public Krowa(String nazwa, double masa) {
        super(nazwa, masa);
    }

    @Override
    public String toString() {
        return "Krowa{" +
                "nazwa='" + nazwa + '\'' +
                ", masa=" + masa +
                "} " + super.toString();
    }
}
