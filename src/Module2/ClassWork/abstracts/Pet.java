package Module2.ClassWork.abstracts;

public abstract class Pet {

    protected int age;
    protected String name;
    protected Pet(int age, String name) {
        this.age = age;
        this.name = name;
    }
    protected abstract void voice();

}
