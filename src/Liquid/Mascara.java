package Liquid;

public class Mascara extends Liquid{
    private int number;
    private int exp_term;

    public Mascara(int nr_items, int number, int exp_term) {
        super(nr_items);
        this.number = number;
        this.exp_term = exp_term;
    }

    public Mascara(Liquid liquid, int number, int exp_term) {
        super(liquid);
        this.number = number;
        this.exp_term = exp_term;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getExp_term() {
        return exp_term;
    }

    public void setExp_term(int exp_term) {
        this.exp_term = exp_term;
    }

    @Override
    public String toString() {
        return "Mascara{" +
                "number=" + number +
                ", exp_term=" + exp_term +
                '}';
    }
}
