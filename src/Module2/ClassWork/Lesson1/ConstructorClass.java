package Module2.ClassWork.Lesson1;

public class ConstructorClass { // шаблон - class
    /*
      Если нет ни одного конструктора, то при компиляции кода, для класса сгенерится
      no-arg конструктор по умолчанию.
      Если есть хоть один конструктор, то default no-arg constructor не создается.

      access_modifier class_name(parameters list) {...}
     */
    // поля - field, object of type String
    public String name;

    public ConstructorClass(String name) {
        this.name = name; // this - это ссылка на объект который в данным момент используется, вызывает данный метод
        System.out.println("Hello from 1 arg constructor");
        System.out.println(">> " +  this.hashCode());
    }

    // поведение - behaviour - methods
    public void printPrettyName() {
        System.out.printf("Name pretty print %s%n", name);
    }

    public void utilSampleMample() {
        ConstructorClass temp = new ConstructorClass("temporary object");
        // ...
    }
}
