package codingBat;

public class Deldel {

    public static void main(String[] args) {
        Deldel d = new Deldel();
        String out = d.delDel("adelbc");
        System.out.println(out);

    }

    public String delDel(String str) {
        if(str.length()>3 && str.substring(1,4).equals("del")) {
            return str = str.substring(0,1)+str.substring(4);
        }
        return str;
    }
}
