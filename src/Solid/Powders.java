package Solid;

public class Powders extends Solid{

    private int tipe;
    private int exp_term;

    public Powders(int nr_items, int grams, int tipe, int exp_term) {
        super(nr_items, grams);
        this.tipe = tipe;
        this.exp_term = exp_term;
    }

    public Powders(Solid solid, int tipe, int exp_term) {
        super(solid);
        this.tipe = tipe;
        this.exp_term = exp_term;
    }

    public int getTipe() {
        return tipe;
    }

    public void setTipe(int tipe) {
        this.tipe = tipe;
    }

    public int getExp_term() {
        return exp_term;
    }

    public void setExp_term(int exp_term) {
        this.exp_term = exp_term;
    }

    @Override
    public String toString() {
        return "Powders{" +
                "tipe=" + tipe +
                ", exp_term=" + exp_term +
                '}';
    }
}
