package Module2.HomeWork.Lesson6.Ex2;

public class Circle implements GeometricObject {

    private double radius;

    @Override
    public String toString() {
        return "Circle[radius=r]";
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}
