package oldstuff.roz04;

public class MojaStatyczna {

    public MojaStatyczna() {
        super();
    }

    public static void main(String[] args) {
        int x = 0;
        x += 5;
        System.out.println(x);

        short ss;

        // byte, short, int, long, float, double, boolean, char

        MojaStatyczna moja = new MojaStatyczna();
        String str = moja.metoda();
        System.out.println(str);


    }
    public String metoda() {
        return super.toString();
    }

//    public void metoda2() {
//        super.finalize();jj
//    }


}
