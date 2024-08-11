package ds4;

public class ArrayStack1<T> {
    // Declare in the stack - step 1
    private int maxSize;
    private int top;
    private T[] items;

    // Constructor - automatically generated
    @SuppressWarnings("unchecked")
    public ArrayStack1(int size) {
        this.maxSize = size;
        this.top = -1;
        this.items = (T[]) new Object[maxSize]; // casting
    }

    public ArrayStack1() { // empty constructor with default size
        this(10); // default size of 10
    }

    // Stack structure
    public void push(T elem) {
        if (top == (maxSize - 1)) { // Check if the stack is full
            throw new IndexOutOfBoundsException("Stack is full");
        } else {
            top++; // Increment the top pointer
            items[top] = elem; // Add the element to the stack
        }
    }

    // pop method
    public T pop() {
        if (top == -1) { // Check if the stack is empty
            throw new IndexOutOfBoundsException("Stack is empty");
        } else {
            T elem = items[top]; // Get the top element
            top--; // Decrement the top pointer
            return elem; // Return the popped element
        }
    }

    public T peek() {
        if (top == -1) { // Check if the stack is empty
            throw new IndexOutOfBoundsException("Stack is empty");
        } else {
            return items[top]; // Return the top element without popping it
        }
    }

    // Getters and setters
    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }

    // toString
    @Override
    public String toString() {
        String str = "Top"; // Start the string with "Top"
        int counter = top;
        while (counter >= 0) { // Loop through the stack from top to bottom
            str += "\n" + items[counter]; // Add each item to the string
            counter--; // Decrement the counter
        }
        return str + "\nBOTTOM"; // End the string with "BOTTOM"
    }
}
