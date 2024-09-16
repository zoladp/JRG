package oldstuff.roz02;

public class PerkusjaTester {
    public static void main(String[] xxy) {
        Perkusja perkusja = new Perkusja();
        perkusja.beben = true;
//        perkusja.talerze = true;

        if(perkusja.beben == true)
            perkusja.zagrajNaBebnach();
        if(perkusja.talerze == true)
            perkusja.zagrajNaTalerzach();
    }
}
