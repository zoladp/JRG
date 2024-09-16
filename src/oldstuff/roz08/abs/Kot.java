package oldstuff.roz08.abs;

public class Kot extends Kotowate implements ZwierzakDom, ZwierzakDomowy {
    @Override
    public void halasuj() {
        System.out.println("Kot halasuje");
    }

    void jedz() {
        System.out.println("Kot je");
    }

    @Override
    public void badzMilutki() {
        System.out.println("Kotek jest milutki");
    }

    @Override
    public void robiDoKuwety() {
        System.out.println("Kotek robi do kuwety");
    }

    @Override
    public void bawSie() {
        System.out.println("Kotek bawi się");
    }
}
