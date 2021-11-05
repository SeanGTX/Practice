import java.util.Arrays;

public class AnyData<T> {

    private T[] a;

    public AnyData(T[] a) {
        this.a = a;
    }

    public T[] getA() {
        return a;
    }

    public T get(int i){
        return a[i];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T t : a) result.append(t).append(" ");
        return result.toString();
    }
}
