package codingBat;

public class HeyChars {
    public static void main(String[] args) {
        System.out.println(('H'+'e'+'y'+'!'));
        String s = "Hej!";
        char h = 'H', e = 'e', y = 'y', ex = '!';
        System.out.println(h+e+y+ex);
        char cc = 31;
        int ind = 31;
        while(cc<401) {
            System.out.print(cc+": "+ind+"\t");
            if((cc%10==0)) System.out.println("\n");
            cc++;
            ind++;
        }

        Object o = new Object();
        Class<?> aClass = o.getClass();
        System.out.println(aClass.getCanonicalName());
    }
}
