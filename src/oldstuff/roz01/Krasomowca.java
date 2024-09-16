package oldstuff.roz01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Krasomowca {

    //trzy grupy slow wybierane do zdania
    String listaSlow1[]={"architektura wielowarstowa", "3000 metrów", "rozwiązanie B-do-B","aplikacja kliencka","interfejs Internetowy"};
    String listaSlow2[]={"zwiększa możliwość", "opracowana dla", "bazująca na"};
    String listaSlow3[]={"procesie", "portalu", "paradygmatu", "strategii","okoliczności","portalu","witryny"};

    //zapewnij niepowtarzalnosc zdań
    private Set<String> generowaneZdanie = new HashSet<>();


    //okreslenie ile jest slow w kazdej z list
    //generowanie trzech losowych słów
    private int randomWord(String[] listaSlow) {
        return (int) (Math.random() * listaSlow.length);
    }

    private String firstLetterUpper(StringJoiner zdanie) {
        String zdanieStr = zdanie.toString();
        return zdanieStr.substring(0, 1).toUpperCase() + zdanieStr.substring(1);
    }

    //stworzenie zdania

    public String stworzenieZdania() {
        StringJoiner zdanie;
        do {
            zdanie=new StringJoiner(" ");
            zdanie.add(listaSlow1[randomWord(listaSlow1)]);
            zdanie.add(listaSlow2[randomWord(listaSlow2)]);
            zdanie.add(listaSlow3[randomWord(listaSlow3)]);

        } while(!generowaneZdanie.add(zdanie.toString()));

        return firstLetterUpper(zdanie);
    }

    public static void main(String[] args) {
        Krasomowca krasomowca=new Krasomowca();
        int counter = 1;
        ArrayList<StringJoiner> zdanie;
        while(counter<91) {
            String zdan = krasomowca.stworzenieZdania();
            System.out.println(counter+". "+zdan);
            counter++;
        }
    }
}
