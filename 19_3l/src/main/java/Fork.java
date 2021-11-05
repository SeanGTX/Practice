//Класс описывающий вилку
public class Fork extends Dish {

    int countTeeth;

    protected Fork(int countTeeth) {
        super(new Color(4, 5 , 6), 0);
        this.countTeeth = countTeeth;
    }

    @Override
    public void onDestroy() {
        System.out.println("Ща какая то придет))");
    }


    public void onOvenCooking() {
        System.out.println("Плавится ваще ужс");
    }
}
