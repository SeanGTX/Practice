public class Application implements Nameable{
    @Override
    public String getName() {
        return this.getClass().getName();
    }
}
