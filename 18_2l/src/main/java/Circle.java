public class Circle {

    private double radius;
    private double area;
    private double circleLength;

    public Circle(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
        circleLength = 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircleLength() {
        return circleLength;
    }

    public void setCircleLength(double circleLength) {
        this.circleLength = circleLength;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", area=" + area + ", circle=" + circleLength + " }";
    }
}
