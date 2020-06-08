package Product;

import Person.Client;

import java.util.List;

public class Liquid extends Product{

    public Liquid(String name, String brand, String s, int year, List<Client> purchaseHistory, float price) {
        super(name, brand, year, purchaseHistory, price);
        this.category = "Liquid";
    }


    @Override
    public String toString(){
        return super.toString() + " category: " + this.category + ".\n";
    }

    public void findCategory(){
        System.out.println("The book " + this.name + " by " + this.brand + " is from the " + this.category + " category");
    }
}