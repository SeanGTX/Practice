public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.ySpeed++;
        bottomRight.ySpeed++;
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.y;
    }

    @Override
    public void moveDown() {
        topLeft.ySpeed--;
        bottomRight.ySpeed--;
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.y;
    }

    @Override
    public void moveLeft() {
        topLeft.xSpeed--;
        bottomRight.xSpeed--;
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.x;
    }

    @Override
    public void moveRight() {
        topLeft.xSpeed++;
        bottomRight.xSpeed++;
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.x;
    }

    public boolean isSameSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed & topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
