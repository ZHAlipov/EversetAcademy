package Module2.HomeWork.Lesson5;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin;    // beginning point
    private Point end;      // ending point

    // Constructors
    public Line (Point begin, Point end) {  // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);   // construct the Points here
          end = new Point(endX, endY);
    }

    // Public methods
    public String toString() {
        return "test";
    }

    public Point getBegin() {
        return this.begin;
    }
    public Point getEnd() {return this.end;}
    public void setBegin(Point begin) {this.begin = begin;}
    public void setEnd(Point end) {this.end = end;}

    public int getBeginX() {return begin.getX();}
    public int getBeginY() {return begin.getY();}
    public int getEndX() {return end.getX();}
    public int getEndY() {return end.getX();}

    public void setBeginX(int beginX) {begin.setX(beginX);}
    public void setBeginY(int beginY) {begin.setX(beginY);}
    public void setBeginXY(int beginX, int beginY) {begin.setX(beginX); begin.setY(beginY);}
    public void setEndX(int endX) {end.setX(endX);}
    public void setEndY(int endY) {end.setX(endY);}
    public void setEndXY(int endX, int endY) {begin.setX(endX); begin.setY(endY);}

    public int getLength() {
        return (int) (int) Math.sqrt(begin.getX()*end.getX() + begin.getY()*end.getY());
    } // Length of the line

//    public double getGradient() {sout;} // Gradient in radians
//    // Math.atan2(yDiff, xDiff)
}