import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<T> extends WaitList<T> {

    private int capacity;
    private int isCreated;

    public BoundedWaitList(int capacity) {
        super(new ConcurrentLinkedQueue<T>());
        this.capacity = capacity;
        isCreated = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(T element) {
        if(isCreated < capacity) {
            super.add(element);
            isCreated++;
        }
        else throw new AddNewException();
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}

