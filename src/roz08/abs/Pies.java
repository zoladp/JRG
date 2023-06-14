package roz08.abs;

import java.util.Objects;

public class Pies extends Psowate implements ZwierzakDomowy {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Pies() {}

    public Pies(String name) {
        setName(name);
    }

    public void halasuj() {
        System.out.println("Pies halasuje");
    }
    void jedz() {
        System.out.println("Pies je");
    }

    @Override
    void wedruj() {
        System.out.println("Pies wędruje");
    }

    @Override
    public void badzMilutki() {
        System.out.println("Pies jest milutki");
    }

    @Override
    public void bawSie() {
        System.out.println("Pies bawi się");
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;

        Pies pies = (Pies) o;

        return Objects.equals(name, pies.name);
    }

    @Override
    public int hashCode() {
        return name!=null ? name.hashCode() : 0;
    }
}
