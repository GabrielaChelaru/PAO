package Liquid;

public class EyeLiner extends Liquid{
    private String color;
    private int exp_term;// in luni

    public EyeLiner(int nr_items, String color, int exp_term){
        super(nr_items);
        this.color=new String(color);
        this.exp_term=exp_term;
    }

    public EyeLiner(Liquid liquid, String color,int exp_term){
        super(liquid);
        this.color=new String(color);
        this.exp_term=exp_term;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
        return "EyeLiner{" +
                "color='" + color + '\'' +
                ", exp_term=" + exp_term +
                '}';
    }
}
