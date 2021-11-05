import java.awt.*;

public class Triangle extends Shape {

    private int length;
    private int width;

    public Triangle(Color color, boolean filled, int length, int width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Polygon p = new Polygon();
        p.addPoint(0, 0);
        p.addPoint(width, length);
        p.addPoint(length, 0);
        if(filled)
            g.fillPolygon(p);
        else
            g.drawPolygon(p);
    }
}
