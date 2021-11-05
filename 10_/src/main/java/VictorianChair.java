public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void onSit() {
        System.out.println("Четкий стул, ему " + getAge() + " лет");
    }
}
