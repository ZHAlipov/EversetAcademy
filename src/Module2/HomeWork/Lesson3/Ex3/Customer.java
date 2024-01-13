package Module2.HomeWork.Lesson3.Ex3;

public class Customer {

    private int id;
    private String name;
    private char gender;


    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
    }

    public int getid() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "name(%s)".formatted(id);
    }

}
