package Solid;

public class Fard extends Solid {
    private int color;
    private int exp_term;

    public Fard(int nr_items, int grams, int color, int exp_term) {
        super(nr_items, grams);
        this.color = color;
        this.exp_term = exp_term;
    }

    public Fard(Solid solid, int color, int exp_term) {
        super(solid);
        this.color = color;
        this.exp_term = exp_term;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getExp_term() {
        return exp_term;
    }

    public void setExp_term(int exp_term) {
        this.exp_term = exp_term;
    }

    @Override
    public String toString() {
        return "Fard{" +
                "color=" + color +
                ", exp_term=" + exp_term +
                '}';
    }
}
