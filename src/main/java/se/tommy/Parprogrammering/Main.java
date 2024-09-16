package se.tommy.Parprogrammering;

public class Main {
    public static void main(String[] args) {
        Product banan = new Product("Banan", 2.5);
        Product kiwi = new Product("Kiwi", 1.5);
        Product mango = new Product("Mango", 1.0);
        Product apple = new Product("Apple", 7.0);
        Product orange = new Product("Orange", 4.5);
        Customer pelle = new Customer("pelle", "pelle@hotmale.com");
        Product[] products = {banan, kiwi, mango, apple, orange};
        Order order = new Order(pelle, products);
        System.out.println("Totala priset är: " + order.calculateTotal() + "kr");
    }
}
