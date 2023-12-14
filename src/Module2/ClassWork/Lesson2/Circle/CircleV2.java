package Module2.ClassWork.Lesson2.Circle;

public class CircleV2 {

    private double radius = 1.0;

    public CircleV2() {}

    public CircleV2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double S = Math.PI * Math.pow(radius, 2);
        return S;
    }

    public double getCircumference() {
        double C = Math.PI * 2 * radius;
        return C;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

class CircleV2Test {
    public static void main(String[] args) {
        CircleV2 circle1 = new CircleV2();
        CircleV2 circle2 = new CircleV2(5);

        System.out.println("Area circle1 = " + circle1.getArea());
        System.out.println("Circumference circle1 = " + circle1.getCircumference());
        System.out.println("Radius circle1 = " + circle1.getRadius());
        System.out.println();

        System.out.println("Area circle1 = " + circle2.getArea());
        System.out.println("Circumference circle1 = " + circle2.getCircumference());
        System.out.println("Radius circle1 = " + circle2.getRadius());
        System.out.println();
    }
}