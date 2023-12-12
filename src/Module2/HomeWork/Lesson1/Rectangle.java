package Module2.HomeWork.Lesson1;

import org.w3c.dom.css.Rect;

public class Rectangle {
    //– Создайте класс под названием «Прямоугольник» с атрибутами длины и ширины.
    //– Реализуйте конструкторы для инициализации объекта Rectangle разными способами:
    //     — Один конструктор не принимает аргументов и инициализирует оба атрибута значением 1.
    //     — Другой конструктор принимает два аргумента для длины и ширины.
    //     — Создайте третий конструктор, который принимает один аргумент для длины стороны и создает квадрат одинаковой длины и ширины.
    //- Протестируйте все конструкторы, создав различные объекты «Прямоугольник» и распечатав их детали.

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle() {}

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length) {
        this.length = length;
        this.width = length;
    }

    public void getInfo() {
        System.out.println("length: " + length);
        System.out.println("width: " + width);
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(100);
        rectangle1.setWidth(80);
        rectangle1.getInfo();
        System.out.println();

        Rectangle rectangle2 = new Rectangle(110, 90);
        rectangle2.getInfo();
        System.out.println();

        Rectangle rectangle3 = new Rectangle(70);
        rectangle3.getInfo();
        System.out.println();
    }


}
