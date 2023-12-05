package Module2.Basics.oop;

public class MyClass {
    public static void main(String[] args) {
        task1();
        task2();
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
}
