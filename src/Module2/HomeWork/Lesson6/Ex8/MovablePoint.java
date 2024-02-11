package Module2.HomeWork.Lesson6.Ex8;

public class MovablePoint implements Movable {

    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(x,y) speed=(x,y)";
    }

    public void moveUp() {
        y -= ySpeed;
    }
    public void moveDown() {
        y += ySpeed;
    }
    public void moveLeft() {
        x -= xSpeed;
    }
    public void moveRight() {
        x += xSpeed;
    }

}
