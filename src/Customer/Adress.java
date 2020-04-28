package Customer;

public  class Adress extends Customer {
    private String street;
    private int street_number;
    private String city;

    public Adress(int nr_customers, String street, int street_number, String city) {
        super(nr_customers);
        this.street = street;
        this.street_number = street_number;
        this.city = city;

    }

    public Adress(Customer customer, String street, int street_number, String city) {
        super(customer);
        this.street = street;
        this.street_number = street_number;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreet_number() {
        return street_number;
    }

    public void setStreet_number(int street_number) {
        this.street_number = street_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", street_number=" + street_number +
                ", city='" + city + '\'' +
                '}';
    }
}
