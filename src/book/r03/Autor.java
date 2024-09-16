package book.r03;

import java.util.List;
import java.util.Objects;

public class Autor {
    String imie;
    String nazwisko;
    int wiek;
    Adres adres;
    List<Ksiazka> ksiazki;

    public Autor(String imie, String nazwisko, int wiek, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adres = adres;
        this.ksiazki = ksiazki;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public List<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(List<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", adres=" + adres +
                ", ksiazki=" + ksiazki +
                '}';
    }
}
