package oldstuff.roz08.intf;

public class Of76 extends Klaun {
    public static void main(String[] args) {
        Nos[] i = new Nos[3];
        i[0] = new Akty();
        i[1] = new Klaun();
        i[2] = new Of76();
        for(int x = 0; x<i.length; x++) {
            System.out.println(i[x].iMetoda()+" "+i[x].getClass());
        }
        System.out.println(i[2].sMetoda());
    }
}
