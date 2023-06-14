package codingBat;

public class EveryNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle",2));
    }

    public static String everyNth(String str, int n) {
        String res = "";
        for(int i = 0; i<str.length(); i=i+n) {
            res += str.charAt(i);
        }
        return res;
    }

}
