package ds4;

public class ArrayStack1App {
    public static void main(String[] args) {
        ArrayStack1<String> aStack = new ArrayStack1<>(10); // 10 for max value
        System.out.println("###### Created ArrayStack1 aStack ######");
        System.out.println("The stack contains: " + aStack.toString());

        try {
            System.out.println("...popping: " + aStack.pop()); // Attempt to pop an element
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cannot pop: " + e.getMessage()); // Handle the exception
        }
    }
}
