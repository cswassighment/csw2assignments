import java.util.*;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public void setLength(double l) {
        this.length = l;
    }

    public void setBreadth(double b) {
        this.breadth = b;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double area() {
        double area = length * breadth;
        return area;
    }

    public double perimeter() {
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(9.5, 7);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
    }
}
