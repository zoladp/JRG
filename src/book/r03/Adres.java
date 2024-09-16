package book.r03;

import java.util.Objects;

public class Adres {
    String ulica;
    String nrDomu;
    String miasto;
    Wojewodztwo wojewodztwo;

    public Adres(String ulica, String nrDomu, String miasto, Wojewodztwo wojewodztwo) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.miasto = miasto;
        this.wojewodztwo = wojewodztwo;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public Wojewodztwo getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(Wojewodztwo wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", nrDomu='" + nrDomu + '\'' +
                ", miasto='" + miasto + '\'' +
                ", wojewodztwo=" + wojewodztwo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;

        Adres adres = (Adres) o;

        if(!Objects.equals(ulica, adres.ulica)) return false;
        if(!Objects.equals(nrDomu, adres.nrDomu)) return false;
        if(!Objects.equals(miasto, adres.miasto)) return false;
        return wojewodztwo==adres.wojewodztwo;
    }

    @Override
    public int hashCode() {
        int result = ulica!=null ? ulica.hashCode() : 0;
        result = 31 * result + (nrDomu!=null ? nrDomu.hashCode() : 0);
        result = 31 * result + (miasto!=null ? miasto.hashCode() : 0);
        result = 31 * result + (wojewodztwo!=null ? wojewodztwo.hashCode() : 0);
        return result;
    }

}
