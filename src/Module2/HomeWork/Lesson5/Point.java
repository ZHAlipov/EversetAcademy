package Module2.HomeWork.Lesson5;

public class Point {
    // Private variables
    private int x;    // x co-ordinate
    private int y;    // y co-ordinate

    // Constructor
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Public methods
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

    class TestPoint {
        public static void main(String[] args) {
            Point p1 = new Point(10, 20);   // Construct a Point
            System.out.println(p1);
            // Try setting p1 to (100, 10).
            p1.setXY(100,10);
            System.out.println(p1);
        }
    }