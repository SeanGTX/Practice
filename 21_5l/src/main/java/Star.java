import java.awt.*;

public class Star extends Shape{

    private int tops;
    private int radius;

    public Star(Color color, boolean filled, int radius, int tops) {
        super(color, filled);
        this.radius = radius;
        this.tops = tops;
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
        for(int i = 0; i < tops * 2; i++)
            p.addPoint((int)(radius * Math.cos(2 * Math.PI / 5 * (2 * i))) ,(int)(radius * Math.sin(2 * Math.PI / 5 * (2 * i))));
        if(filled)
            g.fillPolygon(p);
        else
            g.drawPolygon(p);
    }
}
