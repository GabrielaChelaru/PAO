package Solid;

public class LipStick extends Solid {

    private int shade;
    private int exp_term;

    public LipStick(int nr_items, int grams, int shade, int exp_term) {
        super(nr_items, grams);
        this.shade = shade;
        this.exp_term = exp_term;
    }

    public LipStick(Solid solid, int shade, int exp_term) {
        super(solid);
        this.shade = shade;
        this.exp_term = exp_term;
    }

    public int getShade() {
        return shade;
    }

    public void setShade(int shade) {
        this.shade = shade;
    }

    public int getExp_term() {
        return exp_term;
    }

    public void setExp_term(int exp_term) {
        this.exp_term = exp_term;
    }

    @Override
    public String toString() {
        return "LipStick{" +
                "shade=" + shade +
                ", exp_term=" + exp_term +
                '}';
    }
}
