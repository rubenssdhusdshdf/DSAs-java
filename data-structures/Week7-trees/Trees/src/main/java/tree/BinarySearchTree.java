
package tree;

public class BinarySearchTree <T extends Comparable<T>> implements BinaryTree<T>{
    private BTNode <T> root;
    
    @Override
    public void insert(T elem) {
        if(isEmpty()){
            root = new BTNode <>(elem);
        }
        else{
            insertNode(elem, root);
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        return size(root);
    }
    

    @Override
    public T findMax() {
        if(isEmpty()){
            throw new TreeEmptyException();
        }
        else{
            return findMax(root);
        }
    }

    @Override
    public T findMin() {
        if (isEmpty()) {
            throw new TreeEmptyException();
        } 
        else {
            return findMin(root);
        }
    }

    @Override
    public boolean contains(T elem) {
        return contains(elem, root);
    }

    @Override
    public void inOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean remove(T elem) {
    // We need to locate the node that we want to remove
    BTNode<T> toRemove = findNode(elem); //go to the side and create method 'findNode(T) 
    if (toRemove == null) {
        System.out.println("elem/node not found...");
        return false;
    }
    System.out.println("toRemove = " + toRemove);
 
    // We need to find the parent as pointers need to be reconfigured
    BTNode<T> parent = findParent(elem); //go to the side and create method findParent(T)
    System.out.println("parent = " + parent);
    
        // We need a special case for handling/removing the root
        if(parent == null){
            // in this case the root does not have a parent, so....
            T minValue = findMin(toRemove.right); // 25
            BTNode<T> replacement = findNode(minValue); //25
            BTNode<T> replacementParent = findParent(minValue); //33
            // if no 25 node, so 33 is the min value on RHS subtree
            // 33 needs to be promoted to root, but root.R now also needs 
            // to be updated as 33 should now point to 41, 41 should not be 
            // a surrogate node 
            if(toRemove.right.elem == minValue){//21::33 == 33..33 
                //no 25, so 33 in min, it need to be promoted to root
                // and root.R, which currently points to 33, also
                // needs to be updated .. in this case to 41
                toRemove.elem = minValue; // root.element = 33
                toRemove.right = replacement.right; //so in this case right = 41
                return true;
            }
            else{ 
                System.out.println("Sat 20/07");
                replacementParent.left = null; // 33.L = null, it was 25
                System.out.println("The node being removed is left: " + toRemove);
                toRemove.elem = replacement.elem; // root.element = 25, currently root.L points to 33
                System.out.println("The new Root node is: " + toRemove);
                return true;
            }
        } // if(parent == null)
    
    return false;
}


    
    // Getter and setter
    public BTNode<T> getRoot() {
        return root;
    }

    public void setRoot(BTNode<T> root) {
        this.root = root;
    }

    private void insertNode(T elem, BTNode<T> current) {
        if(elem.compareTo(current.elem) == -1){
            // go to the left, to the left
            if(current.left == null){
                current.left = new BTNode<>(elem);
            }
            else{
                insertNode(elem, current.left);
            }
        }
        else{
            // we are working on the right subtree
            if(current.right == null){
                current.right = new BTNode<>(elem);
            }
            else{
                insertNode(elem, current.right);
            }
        }
    }

    private int size(BTNode<T> current) {
        // Base case
        if(current == null){
            return 0;
        }
        // Call recursively and progress to base case
        else{
            return 1 + size(current.left) + size(current.right);
        }
    }
    
    
    private T findMax(BTNode<T> current) {
        if (current.right == null) {
            return current.elem;
        } else {
            return findMax(current.right);
        }
    }

    private T findMin(BTNode<T> current) {
        if (current.left == null) {
            return current.elem;
        } else {
            return findMin(current.left);
        }
    }

    private boolean contains(T elem, BTNode<T> current) {
        String currentPos = (current == null ? "NULL" : current.elem.toString());
        System.out.println("Searching for: " + elem + ", currently at: " + currentPos);
        if (current == null) { // base case, element not found
            return false;
        }
        if (elem.compareTo(current.elem) == 0) { // element found
            System.out.println("Found the element");
            return true;
        } else if (elem.compareTo(current.elem) == -1) {
            System.out.println("elem < curr, so go left subtree");
            return contains(elem, current.left);
        } else {
            System.out.println("elem > curr, so go right subtree");
            return contains(elem, current.right);
        }
    }

    private BTNode<T> findNode(T elem) {
        return findParent(elem, root);
    }

   private BTNode<T> findParent(T elem, BTNode<T> current) {
    // Need a special case if it is the root that is the current node
    // ...as it does not have a parent
    if (elem.equals(root.elem)) {
        return null; // return null, as root has no parent
    }
    // Go left subtree or right subtree
    if (elem.compareTo(current.elem) == -1) { // Go left
        if (current.left == null) {
            return null; // it wasn't current and there is no left child
        } else if (elem.compareTo(current.left.elem) == 0) {
            return current;
        } else {
            return findParent(elem, current.left);
        }
    } else { // Otherwise, go right
        if (current.right == null) {
            return null; // it wasn't current and there is no right child
        } else if (elem.compareTo(current.right.elem) == 0) {
            return current;
        } else {
            return findParent(elem, current.right);
        }
    }
}


    private BTNode<T> findNode(T elem, BTNode<T> current) { //change root for current private BTNode<T> findNode(T elem, BTNode<T> root)
        //base case
        if (current == null) {
            return null;
        }
        if(current.elem.equals(elem)) {
            return current;
        } 
        else if(current.elem.compareTo(elem) == -1) {
            return findNode(elem, current.right);
        }
        else{
            return findNode(elem, current.left);
        }
    }

    private BTNode<T> findParent(T elem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

