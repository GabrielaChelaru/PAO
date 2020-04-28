
import java.util.Arrays;
import Customer.Customer;
import Liquid.Liquid;
import Solid.Solid;

public class ShoppingCart {
    private int items;
    private int price;
    private Liquid liquid;
    private Solid solid;
    private Customer[] customers;

    public ShoppingCart(int items, int price, Liquid liquid, Solid solid, Customer[] customers) {

        this.items = items;
        this.price = price;
        this.liquid = liquid;
        this.solid = solid;
        this.customers = Arrays.copyOf(customers,customers.length);
        Arrays.sort(this.customers);
    }

    public ShoppingCart(ShoppingCart ob) {
        this.items = ob.items;
        this.price = ob.price;
        this.liquid = ob.liquid;
        this.solid = ob.solid;
        this.customers = Arrays.copyOf(ob.customers, ob.customers.length);
        Arrays.sort(this.customers);
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(Liquid liquid) {
        this.liquid = new Liquid(liquid);
    }

    public Solid getSolid() {
        return solid;
    }

    public void setSolid(Solid solid) {
        this.solid = new Solid(solid);
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = Arrays.copyOf(customers,customers.length) ;
        Arrays.sort(this.customers);
    }


    public void addCustomer(Customer NewCostumer){
        Customer[] aux = new Customer[this.customers.length+1];
        System.arraycopy(this.customers,0,aux,0,this.customers.length);
        aux[this.customers.length]=new Customer(NewCostumer);
        this.customers = new Customer[aux.length];
        System.arraycopy(aux,0,this.customers,0,aux.length);
        Arrays.sort(this.customers);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                ", price=" + price +
                ", liquid=" + liquid +
                ", solid=" + solid +
                ", customers=" + Arrays.toString(customers) +
                '}';
    }
}
