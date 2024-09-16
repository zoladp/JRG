package oldstuff.roz07.zwierz;

public class Test {
    public static void main(String[] args) {
        //        Lew lew = new Lew();
        //        lew.glod = 1;
        //        lew.wedruj();
        //        Wilk wilk = new Wilk();
        //        wilk.glod = 0;
        //        wilk.halasuj();
        //        wilk.wedruj();
        //        wilk.jedz();
        //        wilk.spij();
        //        Tygrys tygrys = new Tygrys();
        //        tygrys.halasuj();
        //        Pies pies = new Pies();
        //        pies.wedruj();
        //        Zwierze pies = new Pies();
        //        pies.wedruj();
        //        System.out.println("=====");
        //        Zwierze wolf = new Wilk();
        //        wolf.jedz();
        //        wolf.halasuj();
        //        wolf.spij();
        //        wolf.wedruj();

        //tablice polimorficzne
        Zwierze[] zwierzeta = new Zwierze[6];
        zwierzeta[0] = new Pies();
        zwierzeta[1] = new Kot();
        zwierzeta[2] = new Wilk();
        zwierzeta[3] = new Hipopotam();
        zwierzeta[4] = new Lew();
        zwierzeta[5] = new Tygrys();

        for (int i = 0; i < zwierzeta.length; i++) {
            System.out.println("------");
            zwierzeta[i].jedz();
            zwierzeta[i].wedruj();
        }

        for (Zwierze zwierze : zwierzeta) {
            System.out.println("*******");
            zwierze.jedz();
        }
    }
}
