package Module2.HomeWork.Lesson4.Ex1;

public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder() {
    }

    ;

    public Cylinder(double height) {
        super();        // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius);  // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    //  use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea() * height;
    }


    class classTestCylinder {  // save as "TestCylinder.java"
        public static void main(String[] args) {
            // Declare and allocate a new instance of cylinder
            //   with default color, radius, and height
            Cylinder c1 = new Cylinder();
            System.out.println("Cylinder:"
                    + " radius=" + c1.getRadius()
                    + " height=" + c1.getHeight()
                    + " base area=" + c1.getArea()
                    + " volume=" + c1.getVolume());

            // Declare and allocate a new instance of cylinder
            //   specifying height, with default color and radius
            Cylinder c2 = new Cylinder(10.0);
            System.out.println("Cylinder:"
                    + " radius=" + c2.getRadius()
                    + " height=" + c2.getHeight()
                    + " base area=" + c2.getArea()
                    + " volume=" + c2.getVolume());

            // Declare and allocate a new instance of cylinder
            //   specifying radius and height, with default color
            Cylinder c3 = new Cylinder(2.0, 10.0);
            System.out.println("Cylinder:"
                    + " radius=" + c3.getRadius()
                    + " height=" + c3.getHeight()
                    + " base area=" + c3.getArea()
                    + " volume=" + c3.getVolume());
        }
    }
}
