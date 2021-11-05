import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {

    protected Color color;
    protected boolean filled;

    Shape(){
    }

    public Shape(Color color, boolean filled) {

        this.color = color;
        this.filled = filled;
        setFilled(filled);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public abstract String toString();
    @Override
    public void paint(Graphics g){
        g.setColor(color);
    };
}
