package Module2.ClassWork.Lesson2;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        double a = length * width;
        return a;
    }

    public double getPerimeter() {
        double p = 2 * (length + width);
        return p;
    }

    public String toString() {
        return "[length=" + length + ", width=" + width + "]";
    }
}

class RectangleTest {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(7, 8);

        System.out.println("Area rectangle1 = " + rectangle1.getArea());
        System.out.println("Length rectangle1 = " + rectangle1.getLength());
        System.out.println("Width rectangle1 = " + rectangle1.getWidth());
        System.out.println("Perimeter rectangle1 = " + rectangle1.getPerimeter());
        System.out.println();

        System.out.println("Area rectangle1 = " + rectangle2.getArea());
        System.out.println("Length rectangle1 = " + rectangle2.getLength());
        System.out.println("Width rectangle1 = " + rectangle2.getWidth());
        System.out.println("Perimeter rectangle1 = " + rectangle2.getPerimeter());
        System.out.println();
    }

}
