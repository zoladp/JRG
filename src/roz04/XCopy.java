package roz04;

public class XCopy {
    public static void main(String[] args) {
        int org = 42;
        XCopy x = new XCopy();
        int y = x.jazda(org);
        System.out.println(org + " " + y);
    }

    int jazda(int arg) {
        return arg * 2;
    }
}
