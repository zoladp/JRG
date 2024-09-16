package book.r03;

public class Ksiazka {
    String tytul;
    Autor autor;
    SzczegolyKsiazki szczegoly;

    public Ksiazka(String tytul, Autor autor, SzczegolyKsiazki szczegoly) {
        this.tytul = tytul;
        this.autor = autor;
        this.szczegoly = szczegoly;
    }


    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public SzczegolyKsiazki getSzczegoly() {
        return szczegoly;
    }

    public void setSzczegoly(SzczegolyKsiazki szczegoly) {
        this.szczegoly = szczegoly;
    }


    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor=" + autor +
                ", szczegoly=" + szczegoly +
                '}';
    }
}

