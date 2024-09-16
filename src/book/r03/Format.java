package book.r03;

public class Format {
    int dimensionX;
    int dimensionY;

    public Format(int dimensionX, int dimensionY) {
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
    }

    public int getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(int dimensionX) {
        this.dimensionX = dimensionX;
    }

    public int getDimensionY() {
        return dimensionY;
    }

    public void setDimensionY(int dimensionY) {
        this.dimensionY = dimensionY;
    }

    @Override
    public String toString() {
        return "Format{" +
                "dimensionX=" + dimensionX +
                ", dimensionY=" + dimensionY +
                '}';
    }
}
