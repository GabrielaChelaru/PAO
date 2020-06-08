package Product;

import Person.Client;

import java.util.List;

public class Solid extends Product {

    public Solid(String name, String brand, String s, int year, List<Client> purchaseHistory, float price){
        super(name, brand, year,purchaseHistory, price);
        this.category = "Solid";

    }

    @Override
    public String toString() {
        return super.toString() + "the category:" + this.category + "/n";
    }

    public void findCategory(){
        System.out.println("The product " + this.name + " by " + this.brand + " is from the " + this.category + " category");
    }
}
