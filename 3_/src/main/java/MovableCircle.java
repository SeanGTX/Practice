public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{\nradius=" + radius + ", " + center.toString() + "\n}";
    }

    @Override
    public void moveUp() {
        center.y++;
    }

    @Override
    public void moveDown() {
        center.y--;
    }

    @Override
    public void moveLeft() {
        center.x--;
    }

    @Override
    public void moveRight() {
        center.x++;
    }
}
