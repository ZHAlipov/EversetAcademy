package Module2.ClassWork.Lesson0;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass {

    // OOP oriented -> ООП
    // Объектно Ориентированное Программирование - взаимодействие объектов между собой
    // В центре всего объект (значит нужен класс!)
    // object: поля (характеристики) и методы(действия)
    // класс это шаблон для создание объектов

    /*
    ООП Принципы
      1. Абстракция - описание объекта в обобщенном, упрощенном виде. Предстает перед нами в виде класса и описания класса.
      2. Инкапсуляция - bundling(связка), сокрытые (hiding)
      3. Наследование - когда классы формируют иерархию parent-child (родитель - ребенок)
      4. Полиморфизм - поли(много) морф(форма) -> много форм. класс фигура: квадрат, круг, треугольник, ...
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(r, c); // arguments
        TwoDimensionalArrayPrinter printer = new TwoDimensionalArrayPrinter();

        printer.printInfo(twoDimensionalArray);

    }

    public static void info() throws FileNotFoundException {
        // Data types:
        // 1. Primitive: byte, short, int, long, float, double, char, boolean
        // 2. Reference: String

    /*
      0 bit
      1 byte
      2 byte[]
      3 String -> char[]
     */
        // System.in -> represents console
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        File file = new File("some.txt");
        Scanner scanner1 = new Scanner(file);
    /*
      Figure:
        properties: Line[]
        behaviour:
          1. create
          2. rotate
          3. move
          4. change

      Line:
        properties: Dot[]
        behaviour:
          1. create / draw
          2. change: shorten, add curve
          3. rotate
     */
    }

    public static void printInfo(Box box) {
        System.out.println("Print info about box: ");
        box.getInfo();
    }

    public static void boxExample() {
        // экземпляр класса = объект = object = instance of a class
        Box box = new Box(); // instance of a class Box, called 'box'
        box.color = "Black";
        box.material = "Pressed Paper";
        box.length = 4;
        box.width = 2;
        box.height = 10;

        Box box1 = new Box(); // instance of a class Box, called 'box'
        box1.color = "Red";
        box1.material = "Metal";
        box1.length = 40;
        box1.width = 2;
        box1.height = 10;

        Box box2 = new Box(); // instance of a class Box, called 'box'
        box2.color = "White";
        box2.material = "Glass";
        box2.length = 4;
        box2.width = 20;
        box2.height = 10;

        Box box3 = new Box(); // instance of a class Box, called 'box'
        box3.color = "Grey";
        box3.material = "Rock";
        box3.length = 4;
        box3.width = 10;
        box3.height = 10;

        printInfo(box);
        printInfo(box1);
        printInfo(box2);
        printInfo(box3);
    }
}