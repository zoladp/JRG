package oldstuff.roz08.intf;

public interface Nos {
    int iMetoda();
    default String sMetoda() {
        return "sMetoda z Nos'a";
    }
}
