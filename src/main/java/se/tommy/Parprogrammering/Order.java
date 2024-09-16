package se.tommy.Parprogrammering;

public class Order {
    private Product[] product;
    private Customer customer;

    //KONSTRUKTOR
    public Order(Customer customer, Product[] products) {
        this.customer = customer;
        this.product = products;
    }


    public double calculateTotal() {
        double total = 0.0;

        for (Product product1 : product) {
            total += product1.getPrice();
        }
        return total;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Product[] getProducts() {
        return product;
    }
}
