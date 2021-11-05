public class TestingTesting {
    public static void main(String[] args) {

        Plate plate = new Plate(new Dish.Color(3, 4, 4), 90);
        System.out.print("Плавим тарелку: ");
        plate.onOvenCooking();
        System.out.print("А тут другую тарелку случайно уронили: ");
        plate.onDestroy();

        System.out.print("\n");

        Fork fork = new Fork(5);
        System.out.print("Плавим вилку: ");
        plate.onOvenCooking();
        System.out.print("А тут случайно уронили другую вилку: ");
        fork.onDestroy();
    }
}
