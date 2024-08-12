package ds5;

public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException() {
        super("There is nothing in the queue :)"); // super is used to calling the sueprclass Constructor or to access
                                                   // superclass Methods or fields
    }
}
