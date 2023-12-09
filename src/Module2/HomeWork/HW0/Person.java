package Module2.HomeWork.HW0;
import java.util.Arrays;

public class Person {
//    Part1: Создайте класс Person. У данного класса должны быть атрибуты: firstname, lastname, age, sex, interests.
//      Первые четыре атрибута довольно явные по типу данных, а вот последний interests должен быть массивом строк.
//    Part2: Создайте 2 объекта, инициализируйте значения их полей.
//      Выведите информацию полей данных объектов в стандартную консоль.
    public String firstname;
    public String lastname;
    public char sex;
    public int age;
    public String[] interests;

    public void getInfo() {
        System.out.println("ФИО: " + lastname + " " + firstname);
        System.out.println("Пол: " + sex);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + Arrays.toString(interests) + "\n");
    }
}

class PersonTask {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstname = "Саша";
        person1.lastname = "Петров";
        person1.sex = 'M';
        person1.age = 33;
        person1.interests = new String[] {"Футбол", "Баскетбол"};
        person1.getInfo();

        Person person2 = new Person();
        person2.firstname = "Маша";
        person2.lastname = "Петрова";
        person2.sex = 'Ж';
        person2.age = 32;
        person2.interests = new String[] {"Воллейбол", "Балет"};
        person2.getInfo();
    }
}
