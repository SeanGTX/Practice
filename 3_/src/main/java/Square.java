public class Square extends Rectangle {
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width = length = side;
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return String.format("Square={\n\tSide=%f\n\tColor=%s\n\tfilled=%s\n}", width, color, filled);
    }
}
