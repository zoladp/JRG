package codingBat;

public class StartOz {
    public static void main(String[] args) {
        StartOz s = new StartOz();
        System.out.println(s.startOz("ozymandias"));
        System.out.println(s.startOz(""));
        System.out.println(s.startOz("o"));
        System.out.println(s.startOz("z"));
        System.out.println(s.startOz("zzzz"));
        System.out.println(s.startOz("ounce"));
        System.out.println(s.startOz("abc"));
    }

    public String startOz(String str) {
        String result = "";
        if (str.length()>=1 && str.charAt(0)=='o') result += str.charAt(0);
        if (str.length()>=2 && str.charAt(1)=='z') result += str.charAt(1);
        if(result.isEmpty()) result = "[ ]";
        return result;
    }
}
