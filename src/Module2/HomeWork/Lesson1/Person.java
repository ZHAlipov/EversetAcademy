package Module2.HomeWork.Lesson1;

public class Person {
    //– Создайте класс с именем **`Person`** с двумя переменными экземпляра: **`name`** и **`age`**.
    //– Создайте объект этого класса и задайте значения **`name`** и **`age`** с помощью конструктора.
    //– Измените класс Person из задачи 2, включив в него несколько конструкторов (перегрузка конструктора).
    //– Один конструктор не должен принимать аргументов и инициализировать **`name`** и **`age`** значениями по умолчанию.
    //– Другой конструктор должен принимать **`name`** и **`age`** в качестве параметров и инициализировать переменные экземпляра.

    //Реализуйте метод равенства в классе Person из задачи 4.
    //Метод должен возвращать true, если имя и возраст двух объектов Person равны, и false в противном случае.

    private String name = "Adam";
    private int age = 18;

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
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person that = (Person) obj;
        return name == that.name && age == that.age;
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

    Person person4 = new Person("Roman", 45);
    person4.getInfo();

        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));
        System.out.println(person3.equals(person4));


    }
}
