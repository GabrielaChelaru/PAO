package Customer;

public class Customer {

    protected int nr_customers;
    protected String name;
    protected String first_name;
    protected double phone_number;

    public Customer(int nr_customers, String name, String first_name, double phone_number) {
        this.nr_customers = nr_customers;
        this.name = name;
        this.first_name = first_name;
        this.phone_number = phone_number;
    }

    public Customer(Customer customer) {
        this.nr_customers = customer.nr_customers;
        this.name = customer.name;
        this.first_name = customer.first_name;
        this.phone_number = customer.phone_number;
    }

    public Customer(int nr_customers) {
        this.nr_customers = nr_customers;
    }

    public int getNr_customers() {
        return nr_customers;
    }

    public void setNr_customers(int nr_customers) {
        this.nr_customers = nr_customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public double getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(double phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nr_customers=" + nr_customers +
                ", name='" + name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
