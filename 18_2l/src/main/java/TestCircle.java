public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.printf("Длинна окружности с радиусом: %f равна: %f\n", circle.getRadius(), circle.getCircleLength());
        System.out.printf("Площадь круга с радиусом: %f равна: %f\n\n", circle.getRadius(), circle.getArea());
        circle.setRadius(2.2);
        System.out.printf("Длинна коружности с радиусом: %f равна: %f\n", circle.getRadius(), circle.getCircleLength());
        System.out.printf("Площадь круга с радиусом: %f равна: %f\n", circle.getRadius(), circle.getArea());

    }
}
