package farma;

public class Kura extends Zwierze {
    public Kura(String nazwa, double masa) {
        super(nazwa, masa);
    }

    @Override
    public String toString() {
        return "Kura{" +
                "nazwa='" + nazwa + '\'' +
                ", masa=" + masa +
                "} " + super.toString();
    }
}
