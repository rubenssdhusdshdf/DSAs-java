package tree;

public class StringBST extends BinarySearchTree <String> {
    public static void main (String[] args) {
        StringBST string = new StringBST();
        string.insert("Hello");
        string.insert("World");
        string.insert("How");
        string.insert("are");
        string.insert("you");
        
        
    }
    
    public int totalLenght() {
        return totalLenght(this.getRoot()); //create method, follow IDE suggestion
    }

    private int totalLenght(BTNode<String> current) { //original private int totalLenght(BTNode<String> root) {
       //Base case
       if (current == null) {
           return 0;
       }
       //Recursive call and progrss to the base case
       return current.elem.length() + totalLenght(current.left)
               + totalLenght(current.right); 
    }
}
