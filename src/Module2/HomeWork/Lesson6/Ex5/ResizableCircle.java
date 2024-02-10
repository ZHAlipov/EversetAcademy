package Module2.HomeWork.Lesson6.Ex5;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[%s]".formatted(super.toString());
    }

    public void resize(int percent) {
        radius *= percent/100;
    }
    
}
