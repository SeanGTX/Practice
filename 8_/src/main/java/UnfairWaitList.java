import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<T> extends WaitList<T> {

    private ConcurrentLinkedQueue<T> someTrash;

    UnfairWaitList() {
        super(new ConcurrentLinkedQueue<T>());
        someTrash = new ConcurrentLinkedQueue<>();
    }

    @Override
    public T remove(T element) {
        if(element.equals(content.peek())) throw new OnDelException();
        someTrash.add(element);
        return super.remove(element);
    }

    @Override
    public void add(T element) {
        if(someTrash.contains(element)) throw new OnDelException();
        super.add(element);
    }

    public void firstMakeLast(){
        content.add(content.poll());
    }
}
