package Liquid;

public class Foundation extends Liquid{
    private String name;
    private int exp_term;

    public Foundation(int nr_items, String name, int exp_term) {
        super(nr_items);
        this.name = name;
        this.exp_term = exp_term;
    }

    public Foundation(Liquid liquid, String name, int exp_term) {
        super(liquid);
        this.name = name;
        this.exp_term = exp_term;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp_term() {
        return exp_term;
    }

    public void setExp_term(int exp_term) {
        this.exp_term = exp_term;
    }

    @Override
    public String toString() {
        return "Foundation{" +
                "name='" + name + '\'' +
                ", exp_term=" + exp_term +
                '}';
    }
}
