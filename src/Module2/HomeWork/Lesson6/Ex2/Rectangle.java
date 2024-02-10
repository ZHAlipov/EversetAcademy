package Module2.HomeWork.Lesson6.Ex2;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }

    @Override
    public String toString() {
        return "Rectangle[width=%s,length=%s]".formatted(this.width, this.length);
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

}
