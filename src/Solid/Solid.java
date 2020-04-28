package Solid;

public class Solid {

    protected int nr_items;
    protected int grams;

    public Solid(int nr_items, int grams) {
        this.nr_items = nr_items;
        this.grams = grams;
    }

    public Solid(Solid solid) {
        this.nr_items =  solid.nr_items;
        this.grams = solid.grams;
    }

    public int getNr_items() {
        return nr_items;
    }

    public void setNr_items(int nr_items) {
        this.nr_items = nr_items;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    @Override
    public String toString() {
        return "Solid{" +
                "nr_items=" + nr_items +
                ", grams=" + grams +
                '}';
    }
}
