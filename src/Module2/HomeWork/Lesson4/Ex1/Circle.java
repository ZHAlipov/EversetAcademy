package Module2.HomeWork.Lesson4.Ex1;

public class Circle {

    private double  radius = 1.0;
    private String color = "red";

    public Circle() {};
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double result = 3.14 * this.radius;
        return result;
    };

    @Override
    public String toString() {
        return "Circle[radius=%s, color=%s]".formatted(this.radius, this.color);
    }
}