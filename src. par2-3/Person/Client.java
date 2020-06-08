package Person;

import Product.Product;

import java.util.ArrayList;
import java.util.Random;

import java.util.List;
public class Client extends Person{

    public List<Product> purchaseHistory =  new ArrayList<Product>();
    private Product productToBuy;
    private float money;

    public Client(int id, String name, float money){
        super(id, name);
        this.money = money;
        this.type = "client";
        this.productToBuy = null;
    }

    public Client(int id, String name, float money, Product productToBuy){
        super(id, name);
        this.money = money;
        this.type = "client that wanna buy";
        this.productToBuy = productToBuy;
    }

    @Override
    public String toString() {
        return " " + super.toString() + "type" + this.type;
    }


    public void buyProduct(Product prod) {
    }
}
