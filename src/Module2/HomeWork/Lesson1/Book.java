package Module2.HomeWork.Lesson1;

import java.util.Scanner;

public class Book {

    private String name, author, type;
    private double price;

    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public double getSale(double price, String type) {
        if (type.equals("Classical")) {
            price = price * 0.9;
        } else if (type.equals("Bestseller")) {
            price = price * 0.9;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Info: %s %s %s %s".formatted(this.name, this.author, getSale(this.price, this.type), this.type);
    }
}

class BookDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество книг:");
        int num = scanner.nextInt();
        Book[] books = new Book[num];


            System.out.println("Введите данные книги:");
            for(int i = 0; i < num; i++) {
                books[i] = new Book(
                        scanner.next(),
                        scanner.next(),
                        scanner.nextDouble(),
                        scanner.next()
                );
                System.out.println(books[i]);
        }
    }
}

/*
War_and_Peace Tolstoy 5000 Classical
Kodzima_genius Wulf 8000 Bestseller
Hobbit Tolkien 9500 Classical
Potter Rowling 10000 Simple
*/