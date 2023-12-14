package Module2.ClassWork.Lesson2.Circle;
import java.lang.Math;

public class CircleV1 {
    //Это первое упражнение проведет вас через все *базовые концепции* ООП.
    //Класс под названием **`circle`** устроен, как показано на следующей диаграмме классов. Это содержит:
    //- Две `частные` переменные экземпляра: `radius` (типа ``double`) и `color` (типа ``String`) со значением по умолчанию
    // `1.0` и "`red`" соответственно.
    //- Два *перегруженных* конструктора: *конструктор по умолчанию* без аргумента и конструктор, который принимает двойной аргумент
    // для радиуса.
    //- Два общедоступных метода: getRadius() и getArea(), которые возвращают радиус и площадь этого экземпляра соответственно.

    private double radius;
    private String color = "red";

    public CircleV1() {
        this.radius = 1.0;
    }

    public CircleV1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double S = Math.PI * Math.pow(radius, 2);
        return S;
    }
}

class CircleV1Test {
    public static void main(String[] args) {
        CircleV1 circle1 = new CircleV1();
        CircleV1 circle2 = new CircleV1(3);

        System.out.println("Area circle1 = " + circle1.getArea());
        System.out.println("Radius circle1 = " + circle1.getRadius());
        System.out.println();

        System.out.println("Area circle2 = " + circle2.getArea());
        System.out.println("Radius circle2 = " + circle2.getRadius());
        System.out.println();


    }
}