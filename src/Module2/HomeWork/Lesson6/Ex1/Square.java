package Module2.HomeWork.Lesson6.Ex1;

public class Square extends Rectangle {

    protected double side;

    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }


    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    public String toString() {
        return "Square[%s]".formatted(super.toString());
    }

}
