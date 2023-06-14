package codingBat;

public class PosNeg {
    public static void main(String[] args) {
        posNeg(1,-1,true);
        posNeg(-1,5,false);
        posNeg(-1,1,false);
        posNeg(1,-1,false);
        posNeg(-1,-1,false);
        posNeg(-1,-1,true);
    }

    static boolean posNeg(int a, int b, boolean negative) {
        boolean res;
        if(negative) res = (a<0&&b<0);
        else res = ((a<0&&b>0) || (a>0&&b<0));
        System.out.println(res);
        return res;
    }
}
