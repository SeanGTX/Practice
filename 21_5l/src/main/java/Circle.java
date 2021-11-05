import java.awt.*;

public class Circle extends Shape {

    protected int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Color color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle={\n\tRadius=%f\n\tColor=%s\n\tfilled=%s\n}", radius, color, filled);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(filled)
            g.fillOval(0, 0 , radius, radius);
        else
            g.drawOval(0, 0, radius, radius);
    }
}
