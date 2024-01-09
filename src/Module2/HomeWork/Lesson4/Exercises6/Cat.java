package Module2.HomeWork.Lesson4.Exercises6;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat[%s]".formatted(super.toString());
    }

    public void greets() {
        System.out.println("Meow");
    }
}
