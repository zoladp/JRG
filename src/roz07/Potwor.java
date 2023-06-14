package roz07;

public class Potwor {
    boolean strasz(int x) {
        System.out.println("ałłuuuuuu");
        return false;
    }
}

class Wampir extends Potwor {
    boolean strasz(byte x) {
        System.out.println("można gryza?");
        return true;
    }
}

class Smok extends Potwor {
    boolean strasz(int stopien) {
        System.out.println("zioń ogniem");
        return true;
    }
}

class PotworTester {
    public static void main(String[] args) {
        Potwor[] ptw = new Potwor[3];
        ptw[0] = new Wampir();
        ptw[1] = new Smok();
        ptw[2] = new Potwor();
        for (Potwor potwor : ptw) {
            potwor.strasz(2);
        }
    }
}