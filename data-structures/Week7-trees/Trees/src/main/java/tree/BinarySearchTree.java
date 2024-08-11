package tree;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruben
 */
public class BinarySearchTree {
    
}

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
}
