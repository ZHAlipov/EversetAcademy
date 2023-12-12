package Module2.ClassWork.Lesson2;

import java.io.PrintStream;

public class Person {
//    1. Создание класса с геттерами и сеттерами:
//    Создайте класс "Person" с приватными полями name и age. Добавьте геттеры и сеттеры для обоих полей.
//    Затем создайте объект класса Person, установите значения полей с использованием сеттеров и выведите информацию с использованием геттеров.
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Dana");
        person1.setAge(34);
        System.out.println("Name: " + person1.getName() + ";\nAge: " + person1.getAge() + ".\n");
    }
}
