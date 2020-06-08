import Product.*;
import Person.Client;
import Person.Person;

import java.util.ArrayList;
import java.util.List;

public class addProduct {

    private static Object Input;
    private static Object Output;

    public static void addProducts(allProducts prod, Input input, Output output){
        List<String[]> products =  input.read("C://");

        for(int i = 0; i < products.size(); i++){
            List<Client> clients = new ArrayList<Client>();
            String[] aux = products.get(i);
            if(aux[0].toString().toLowerCase().equals("liquid")){
                Product product = new Liquid(aux[1].toString(),aux[2].toString(),aux[3].toString(),Integer.parseInt(aux[4]),clients, Integer.parseInt(aux[5]));
                prod.addProduct(product);
            }

            if (aux[0].toString().toLowerCase().equals("solid")){
                Product product = new Solid(aux[1].toString(),aux[2].toString(),aux[3].toString(),Integer.parseInt(aux[4]),clients, Integer.parseInt(aux[5]));
                prod.addProduct(product);
            }

            if (aux[0].toString().toLowerCase().equals("powder")){
                Product product = new Powder(aux[1].toString(),aux[2].toString(),aux[3].toString(),Integer.parseInt(aux[4]),clients, Integer.parseInt(aux[5]));
                prod.addProduct(product);
            }
        }

        public static void addClient(allProducts prod, Input input, Output output){
            List<String[]> clients = input.read("C://");
            ClientService clientService = new ClientService();

            for (int i = 0; i < clients.size(); ++i){
                String[] client_aux = clients.get(i);
                Client client;

                if (client_aux.length == 3) {
                    client = new Client(Integer.parseInt(client_aux[0]), client_aux[1].toString(),
                            Integer.parseInt(client_aux[2]));
                    clientService.buyProduct(prod, client);
                }
                else{
                    Product searchThis = new Product(client_aux[3].toString(), client_aux[4].toString());
                    client = new Client(Integer.parseInt(client_aux[0]), client_aux[1].toString(),
                            Integer.parseInt(client_aux[2]));
                    ClientService.buyProduct(prod, client);
                }
            }
            output.write("adaugare_clienti");

        }
    }
}
