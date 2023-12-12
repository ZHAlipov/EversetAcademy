package Module2.HomeWork.Lesson1;

public class Person {
    //– Создайте класс с именем **`Person`** с двумя переменными экземпляра: **`name`** и **`age`**.
    //– Создайте объект этого класса и задайте значения **`name`** и **`age`** с помощью конструктора.
    //– Измените класс Person из задачи 2, включив в него несколько конструкторов (перегрузка конструктора).
    //– Один конструктор не должен принимать аргументов и инициализировать **`name`** и **`age`** значениями по умолчанию.
    //– Другой конструктор должен принимать **`name`** и **`age`** в качестве параметров и инициализировать переменные экземпляра.

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

    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println();
    }

    public Person() {
        this.name = "Noname";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class PersonTest {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.setName("Carl");
    person1.setAge(33);
    person1.getInfo();

    Person person2 = new Person();
    person2.getInfo();

    Person person3 = new Person("Roman", 45);
    person3.getInfo();

    }
}
