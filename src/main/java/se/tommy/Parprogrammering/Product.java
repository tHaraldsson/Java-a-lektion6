package se.tommy.Parprogrammering;

public class Product {
    //ATTRIBUT
    private String name;
    private double price;

    //KONSTRUKTOR
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
