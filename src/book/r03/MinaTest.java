package book.r03;

import java.util.Date;

public class MinaTest {
    public static void main(String[] args) {
        Adres adresAutora = new Adres("Główna", "21a", "Kłodawa", Wojewodztwo.LUBUSKIE);
        SzczegolyKsiazki szczegolyKsiazki = new SzczegolyKsiazki(123456789, new Date(2024, 5, 30), 342342, new Date(2024, 5, 30), new Format(160, 80), 4325345, 15.2, 8.8, 5.6, "Poradnik");
        Autor autor = new Autor("Jerzy", "Ziemba", 64, adresAutora);
        Ksiazka ksiazka = new Ksiazka("Chat GPT", autor, szczegolyKsiazki);
        System.out.println(ksiazka);


    }
}
