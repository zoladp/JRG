package oldstuff.roz05.gra2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PomocnikGry {
    public String pobierzDaneWejsciowe(String komunikat) {
        String wierszWej = null;
        System.out.print(komunikat + " ");
        try {
            BufferedReader sw = new BufferedReader(new InputStreamReader(System.in));
            wierszWej = sw.readLine();
            if (wierszWej.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOExceptionn: "+e);
        }
        return wierszWej;
    }
}
