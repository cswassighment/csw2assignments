import java.util.*;

public class Point {
    private double X;
    private double Y;

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public Point(Point p) {
        this.X = p.X;
        this.Y = p.Y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double x) {
        this.X = x;
    }

    public void setY(double y) {
        this.Y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(4.5, 1.2);
        Point p2 = new Point(p1);
        System.out.println("Point 1 values are: X:" + p1.getX() + " and Y:" + p1.getY());
        System.out.println("Point 2 values are: X:" + p2.getX() + " and Y:" + p2.getY());
        p2.setX(3.3);
        p2.setY(5.6);
        System.out.println("Point 2 values after changing are: X:" + p2.getX() + " and Y:" + p2.getY());
    }
}
