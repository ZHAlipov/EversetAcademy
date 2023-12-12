package Module2.ClassWork.Lesson2;

public class Book {
//    2. Конструкторы:
//    Создайте класс "Book" с полями title, author и year. Реализуйте два конструктора: один по умолчанию (default),
//    устанавливающий значения по умолчанию, и второй пользовательский, который позволяет установить значения полей при создании объекта.
//    Создайте объекты с использованием обоих конструкторов.
    private String title;
    private String author;
    private int year;

    public Book() {
        this.title = "Lorem ipsum";
        this.author = "Pushkin";
        this.year = 1970;
    }
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void getInfo() {
        System.out.println(getTitle());
        System.out.println(getAuthor());
        System.out.println(getYear());
    }
}

class BookTest {
    public static void main(String[] args) {

    Book book1 = new Book();
    book1.getInfo();
    System.out.println();

    Book book2 = new Book("Lorem ipsum2", "Pushkin", 1971);
    book2.getInfo();

    }
}
