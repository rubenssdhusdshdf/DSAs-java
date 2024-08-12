package ds5;

public interface QueueInterface<T> {
    public void enqueue(T elem);

    public T dequeue();

    public boolean isEmpty();

    public T peek();

    public int size();
}