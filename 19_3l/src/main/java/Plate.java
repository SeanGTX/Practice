public class Plate extends Dish{
    protected Plate(Color color, int volume) {
        super(color, volume);
    }

    @Override
    public void onDestroy() {
        System.out.println("Очень много осколков цвета " + getColor());
    }

    @Override
    public void onOvenCooking() {
        System.out.println("Еда на плавлющемся куске тарелки цвета " + getColor());
    }
}
