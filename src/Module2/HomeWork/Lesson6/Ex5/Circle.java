package Module2.HomeWork.Lesson6.Ex5;

public class Circle implements GeometricObject {

    protected double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=%s]".formatted(this.radius);
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}
