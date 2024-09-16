package book.r03;

import java.util.Date;

public class SzczegolyKsiazki {
    long isbn;
    Date dataWydania;
    long isbnEbook;
    Date dataWydaniaEbooka;
    Format format;
    int nrKatalogu;
    double rozmiarPdf;
    double rozmiarEpub;
    double rozmiarMobi;
    String kategoria;

    public SzczegolyKsiazki(long isbn, Date dataWydania, long isbnEbook, Date dataWydaniaEbooka, Format format, int nrKatalogu, double rozmiarPdf, double rozmiarEpub, double rozmiarMobi, String kategoria) {
        this.isbn = isbn;
        this.dataWydania = dataWydania;
        this.isbnEbook = isbnEbook;
        this.dataWydaniaEbooka = dataWydaniaEbooka;
        this.format = format;
        this.nrKatalogu = nrKatalogu;
        this.rozmiarPdf = rozmiarPdf;
        this.rozmiarEpub = rozmiarEpub;
        this.rozmiarMobi = rozmiarMobi;
        this.kategoria = kategoria;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public Date getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(Date dataWydania) {
        this.dataWydania = dataWydania;
    }

    public long getIsbnEbook() {
        return isbnEbook;
    }

    public void setIsbnEbook(long isbnEbook) {
        this.isbnEbook = isbnEbook;
    }

    public Date getDataWydaniaEbooka() {
        return dataWydaniaEbooka;
    }

    public void setDataWydaniaEbooka(Date dataWydaniaEbooka) {
        this.dataWydaniaEbooka = dataWydaniaEbooka;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public int getNrKatalogu() {
        return nrKatalogu;
    }

    public void setNrKatalogu(int nrKatalogu) {
        this.nrKatalogu = nrKatalogu;
    }

    public double getRozmiarPdf() {
        return rozmiarPdf;
    }

    public void setRozmiarPdf(double rozmiarPdf) {
        this.rozmiarPdf = rozmiarPdf;
    }

    public double getRozmiarEpub() {
        return rozmiarEpub;
    }

    public void setRozmiarEpub(double rozmiarEpub) {
        this.rozmiarEpub = rozmiarEpub;
    }

    public double getRozmiarMobi() {
        return rozmiarMobi;
    }

    public void setRozmiarMobi(double rozmiarMobi) {
        this.rozmiarMobi = rozmiarMobi;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "SzczegolyKsiazki{" +
                "isbn=" + isbn +
                ", dataWydania=" + dataWydania +
                ", isbnEbook=" + isbnEbook +
                ", dataWydaniaEbooka=" + dataWydaniaEbooka +
                ", format=" + format +
                ", nrKatalogu=" + nrKatalogu +
                ", rozmiarPdf=" + rozmiarPdf +
                ", rozmiarEpub=" + rozmiarEpub +
                ", rozmiarMobi=" + rozmiarMobi +
                ", kategoria='" + kategoria + '\'' +
                '}';
    }
}
