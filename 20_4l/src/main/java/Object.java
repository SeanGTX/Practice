public class Object implements Nameable {
    @Override
    public String getName() {
        return this.getClass().getName();
    }
}
