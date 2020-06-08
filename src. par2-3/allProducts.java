import Person.Client;
import Product.Product;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class allProducts {
    public List<Client> clients;
    public List<Product> products;
    public float money;

    public allProducts(List<Client> clients, List<Product>products, float money){
        this.clients = clients;
        this.products = products;
        this.money = money;
    }

    public void addProduct(Product product){
        this.products.add(product);
        this.money -=  product.price;
        System.out.println("Added" + product.toString());

    }

    public boolean searchProduct(Product product, Client  client){
        System.out.println("Searching for this product" + product);
        if(this.products.contains(product)) {
            if(this.clients.contains(client))
                System.out.println("HEllO" + client.toString());
            else{
                    this.clients.add(client);
                }

                int id_product = this.products.indexOf(product);
                this.products.get(id_product).purchaseHistory.add(client);
                return true;
        }
        return false;
    }

    public void showPrduct(Output output){
        System.out.println("Product are:" + this.products);

        output.write("cout_prod");
    }

    public void seePurchaseHistory(Output output){
        for(int i = 0; i < this.products.size(); i++){
            this.products.get(i).viewPurchaseHistory();
        }
        output.write("cout_PH");
    }

    public void seeClientInfo(Output output){
        System.out.println("Number of clients" + this.clients.size());
        for(int i = 0; i < this.clients.size(); i++){
            System.out.println(this.clients.get(i).toString());
        }

        output.write("cout_info_clienti");
    }
}
