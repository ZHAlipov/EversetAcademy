package Module2.HomeWork.Lesson4.Exercises6;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name=\"%s\"]".formatted(this.name);
    }
}
