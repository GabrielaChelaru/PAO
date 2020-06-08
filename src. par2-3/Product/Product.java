package Product;

import Person.Client;

import java.util.List;

public class Product implements Comparable<Product>{

    public String name;
    public String brand;
    public int year;
    public int id;
    public List<Client> purchaseHistory;
    protected String category;

    public float price;

    public Product(String name,String brand, int year, List<Client> purchaseHistory, float price) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.id = hashCode();
        this.purchaseHistory = purchaseHistory;
        this.price = price;
    }

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Product(String name, String brand,  int year, List<Client> purchaseHistory) {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void viewPurchaseHistory(){
        System.out.println("Purchase History Clients: " + this.purchaseHistory);
    }

    @Override
    public String toString() {
        return "Product {" +
                "name: " + this.name +
                ", brand: " + this.brand +
                ", year: " + this.year +
                '}';
    }

    @Override
    public int compareTo(Product b) {
        return this.getName().compareTo(b.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            return this.getBrand().equals(product.getBrand()) && this.getName().equals(product.getName());
        }
        return false;
    }

}