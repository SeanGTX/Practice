public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("fyking magik");
    }

    @Override
    public void onSit() {
        System.out.println("Вжух и ты сидишь на магик стуле который делает");
        doMagic();
    }
}
