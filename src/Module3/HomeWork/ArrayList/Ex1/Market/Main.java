package Module3.HomeWork.ArrayList.Ex1.Market;
import java.util.*;


class Product {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", rating=" + rating + '}';
    }



}

class Categories {
    String name;
    List<Product> products;

    public Categories(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printProducts() {
        System.out.println("Category: " + name);
        for (Product product : products) {
            System.out.println(product);
        }
    }


}

class Basket {
    List<Product> basket;

    public Basket(List<Product> basket) {
        this.basket = basket;
    }

    public void addProduct(Product product) {
        basket.add(product);
    }

    public void printBasket() {
        System.out.println("Basket:");
        for (Product product : basket) {
            System.out.println(product);
        }
    }


}

class User {
    String login;
    String password;
    Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public void addBasket(Product product) {
        basket.addProduct(product);
    }

    public void printBasket() {
        System.out.println("Login: " + login);
        basket.printBasket();
    }

}

public class Main {
    public static void main(String[] args) {
        Categories fruits = new Categories("Fruits");
        Categories vegetables = new Categories("Vegetables");

        Product apple = new Product("Apple", 3.99, 5.0);
        Product banana = new Product("Banana", 2.45, 4.5);
        Product tomato = new Product("Tomato", 4.0, 3.5);
        Product spinach = new Product("Spinach", 1.3, 2.0);

        fruits.addProduct(apple);
        fruits.addProduct(banana);
        vegetables.addProduct(tomato);
        vegetables.addProduct(spinach);

        fruits.printProducts();
        fruits.printProducts();
    }
}