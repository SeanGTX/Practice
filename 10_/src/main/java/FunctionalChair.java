public class FunctionalChair implements Chair {
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public void onSit() {
        System.out.println("е бой на стуле можно сложить две чиселки " + sum(3, 4));
    }
}
