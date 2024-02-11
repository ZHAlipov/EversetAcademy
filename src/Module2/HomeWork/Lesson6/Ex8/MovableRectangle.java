package Module2.HomeWork.Lesson6.Ex8;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomLeft;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    public void moveUp() {
        topLeft.y -= topLeft.ySpeed;
        bottomLeft.y -= bottomLeft.ySpeed;
    }
    public void moveDown() {
        topLeft.y += topLeft.ySpeed;
        bottomLeft.y += bottomLeft.ySpeed;
    }
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomLeft.x -= bottomLeft.xSpeed;
    }
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomLeft.x += bottomLeft.xSpeed;
    }

}
