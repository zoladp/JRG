package oldstuff.roz08.abs;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        //        Pies pies = new Pies();
        //        pies.jedz();
        //        pies.wedruj();
        //        pies.spij();
        //
        //        Psowate pies1 = new Pies();
        //        pies1.jedz();
        //        pies1.wedruj();
        //        pies1.spij();

        Zwierze pies2 = new Pies();
        pies2.spij();
        pies2.halasuj();
        pies2.jedz();
        pies2.wedruj();

        System.out.println();
        System.out.println(pies2.hashCode());
        System.out.println(pies2.toString());
        System.out.println(pies2.getClass());

        //        Psowate pies3 = new Psowate();

        ArrayList<Pies> listaPsow = new ArrayList<>();
        Pies pies = new Pies("kaziuk");
        listaPsow.add(pies);
        Pies p = listaPsow.get(0);
        System.out.println(p.getName());
        p.badzMilutki();
        p.bawSie();

        Kot kot = new Kot();
        kot.bawSie();
        kot.badzMilutki();
        System.out.println();

        Zwierze pies3 = new Pies();
        pies3.jedz();

        Pies p4 = new Pies("kindel");
        String name = p4.getName();
        System.out.println(name);

        System.out.println("===========");
        Wilk wilczek = new Wilk();
        wilczek.spij();
    }
}
