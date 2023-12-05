package Module2.HomeWork;

import Module2.Basics.oop.Dog;
import Module2.Basics.oop.Person;
import Module2.Basics.oop.Rectangle;

import java.util.Scanner;

public class HW1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    private static void task1() {
        Person person1 = new Person();
        person1.name = "Sasha";
        person1.age = 34;

        Person person2 = new Person();
        person2.name = "Pasha";
        person2.age = 18;

        person2.getInfo();
        person1.getInfo();
    }

    public static void task2() {
        Dog dog1 = new Dog();
        dog1.name = "Pushka";
        dog1.breed = "Therier";

        Dog dog2 = new Dog();
        dog2.name = "Kruzhka";
        dog2.breed = "Ovcharka";

        dog1.getInfo();
        dog2.getInfo();
    }

    public static void task3() {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.height = 10;
        rectangle1.width = 30;

        rectangle2.height = 20;
        rectangle2.width = 40;

        rectangle1.getPerimeter();
        rectangle2.getArea();
    }
}
