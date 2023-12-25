package Module2.HomeWork.Lesson1;

public class Book {
    //– Создайте класс под названием «Книга» с атрибутами названия, автора и года публикации.
    //– Внедрите метод toString, чтобы обеспечить описательное представление объекта Book.
    //– Это строковое представление должно включать название, автора и год публикации, разделенные запятыми.
    //- Протестируйте метод toString, создав объект Book и распечатав его с помощью метода System.out.println.

    private String title = "Harry Potter";
    private String author = "D.Rowling";
    private int publicationYear = 1993;

    @Override
    public String toString() {
        return "Title: " + title + ". Author: " + author + ". Publication year: " + publicationYear;
    }
}

class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.toString());
    }
}
