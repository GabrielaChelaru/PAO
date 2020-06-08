package Product;

import Person.Client;

import java.util.List;

public class Powder extends Product{

    public Powder(String name, String brand, String s, int year, List<Client> purchaseHistory, float price) {
        super(name, brand, year, purchaseHistory, price);
        this.category = "Powder";
    }

    @Override
    public String toString() {
        return super.toString() + "the category:" + this.category + "/n";
    }

    public void findCategory(){
        System.out.println("The product " + this.name + " by " + this.brand + " is from the " + this.category + " category");
    }
}
