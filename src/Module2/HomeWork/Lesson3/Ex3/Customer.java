package Module2.HomeWork.Lesson3.Ex3;


import Module2.HomeWork.Lesson3.Ex4.Gender;

public class Customer {

    private int id;
    private String name;
    private Gender gender;


    public Customer(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getid() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Gender getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "name(%s)".formatted(id);
    }

}
