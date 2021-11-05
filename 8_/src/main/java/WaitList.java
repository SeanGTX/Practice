import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<T> implements IWaitList<T> {

    protected ConcurrentLinkedQueue<T> content;

    /**
     *
     * @param content
     */

    public WaitList(ConcurrentLinkedQueue<T> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(T element) {
        content.add(element);
    }

    @Override
    public T remove(T element) {
        content.remove(element);
        return element;
    }

    @Override
    public boolean contains(T element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<T> elements) {
        return content.containsAll(elements);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
