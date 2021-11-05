import java.awt.*;

public class Rectangle extends Shape {

    protected int width;
    protected int length;

    public Rectangle() {}

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(Color color, int length, int width, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return String.format("Rectangle={\n\tWidth=%f\n\tLength=%f\n\tColor=%s\n\tfilled=%s\n}", width, length, color, filled);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(filled)
            g.fillRect(0, 0, width-1, length);
        else
            g.drawRect(0, 0, width-1, length);
    }
}
