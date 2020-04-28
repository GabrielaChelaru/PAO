package Liquid;

public class Liquid {
    protected int nr_items;

    public Liquid(int nr_items) {
        this.nr_items = nr_items;
    }

    public Liquid(Liquid liquid){
        this.nr_items=liquid.nr_items;
    }

    public int getNr_items() {
        return nr_items;
    }

    public void setNr_items(int nr_items) {
        this.nr_items = nr_items;
    }

    @Override
    public String toString() {
        return "Liquid{" +
                "nr_items=" + nr_items +
                '}';
    }
}
