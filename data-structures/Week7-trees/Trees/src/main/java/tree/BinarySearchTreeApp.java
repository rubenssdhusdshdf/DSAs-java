/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Ruben
 */
public class BinarySearchTreeApp {
     public static void main(String[] args) {
        System.out.println("####### Create a new BST #######");
        BinarySearchTree<Integer> myBST1 = new BinarySearchTree<>();
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());

        System.out.println("######## insert at root 21 #######");
        myBST1.insert(21);
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());    
 
        System.out.println("######## insert at root.L = 10 #######");
        myBST1.insert(10);
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());

        System.out.println("######## insert at root.R = 33 #######");
        myBST1.insert(33);
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());

        //                21
        //      10                33  
        System.out.println("######## findMax, should get 33 #######");    
        System.out.println("findMax myBST1: " + myBST1.findMax());   //33     

        System.out.println("######## findMin, should get 10 #######");  
        System.out.println("findMin myBST1: " + myBST1.findMin());   //10

        System.out.println("######## insert 6 in 10 21 33 #######");
        myBST1.insert(6);
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size()); // 4
        System.out.println("myBST1::root: " + myBST1.getRoot());

        System.out.println("######## insert 15 #######");
        //                21
        //      10                33
        //   6       15
        myBST1.insert(15);
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());
        System.out.println("myBST1::root.L: " + myBST1.getRoot().left);
        System.out.println("myBST1::root.L.L: " + myBST1.getRoot().left.left);
        System.out.println("myBST1::root.L.R: " + myBST1.getRoot().left.right);
        System.out.println("myBST1::root.R: " + myBST1.getRoot().right);
        System.out.println("myBST1::root.R.L: " + myBST1.getRoot().right.left);
        System.out.println("myBST1::root.R.R: " + myBST1.getRoot().right.right);

        System.out.println("######## insert 25 #######");
        //                21
        //      10                33
        //   6       15        25
        myBST1.insert(25);
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());
        System.out.println("myBST1::root.L: " + myBST1.getRoot().left);
        System.out.println("myBST1::root.L.L: " + myBST1.getRoot().left.left);
        System.out.println("myBST1::root.L.R: " + myBST1.getRoot().left.right);
        System.out.println("myBST1::root.R: " + myBST1.getRoot().right);
        System.out.println("myBST1::root.R.L: " + myBST1.getRoot().right.left);
        System.out.println("myBST1::root.R.R: " + myBST1.getRoot().right.right);

        System.out.println("######## findMax, should get 33 #######");
        //                21
        //      10                33
        //   6       15       25      
        System.out.println("findMax myBST1: " + myBST1.findMax());   //33     

        System.out.println("######## findMin, should get 6 #######");
        //                21
        //      10                33
        //   6       15       25      
        System.out.println("findMin myBST1: " + myBST1.findMin());   //6

        System.out.println("######## insert 41 #######");
        //                21
        //      10                33
        //   6       15       25      41
        myBST1.insert(41);
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());
        System.out.println("myBST1::root.L: " + myBST1.getRoot().left);
        System.out.println("myBST1::root.L.L: " + myBST1.getRoot().left.left);
        System.out.println("myBST1::root.L.R: " + myBST1.getRoot().left.right);
        System.out.println("myBST1::root.R: " + myBST1.getRoot().right);
        System.out.println("myBST1::root.R.L: " + myBST1.getRoot().right.left);
        System.out.println("myBST1::root.R.R: " + myBST1.getRoot().right.right);

        System.out.println("######## findMax, should get 41 #######");
        //                21
        //      10                33
        //   6       15       25      41
        System.out.println("findMax myBST1: " + myBST1.findMax());   //41     

        System.out.println("######## findMin, should get 6 #######");
        //                21
        //      10                33
        //   6       15       25      41
        System.out.println("findMin myBST1: " + myBST1.findMin());   //6  

        System.out.println("######## contains 41 #######");
        //                21
        //      10                33
        //   6       15       25      41
        System.out.println("Does the tree contain 41: " + myBST1.contains(41));
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());

        System.out.println("######## contains 6 #######");
        //                21
        //      10                33
        //   6       15       25      41
        System.out.println("Does the tree contain 6: " + myBST1.contains(6));
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());

        System.out.println("######## contains 33 #######");
        //                21
        //      10                33
        //   6       15       25      41
        System.out.println("Does the tree contain 33: " + myBST1.contains(33));
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());

        System.out.println("######## contains 2 #######");
        //                21
        //      10                33
        //   6       15       25      41
        System.out.println("Does the tree contain 2: " + myBST1.contains(2));
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());    
        
        
        System.out.println("##### remove 4 #####");
        //                21
        //      10                33
        //   6       15       25      41
        
        System.out.println("remove(4): " + myBST1.remove(4)); //not found
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());
        System.out.println("myBST1::root.L: " + myBST1.getRoot().left);
        System.out.println("myBST1::root.L.L: " + myBST1.getRoot().left.left);
        System.out.println("myBST1::root.L.R: " + myBST1.getRoot().left.right);
        System.out.println("myBST1::root.R: " + myBST1.getRoot().right);
        System.out.println("myBST1::root.R.L: " + myBST1.getRoot().right.left);
        System.out.println("myBST1::root.R.R: " + myBST1.getRoot().right.right);

        
        System.out.println("##### remove 10 #####");
        
        //                21
        //      10                33
        //   6       15       25      41
        
        System.out.println("remove(10): " + myBST1.remove(10)); // I should get node 10 details
        System.out.println("isEmpty myBST1: " + myBST1.isEmpty());
        System.out.println("myBST1.size: " + myBST1.size());
        System.out.println("myBST1::root: " + myBST1.getRoot());
        System.out.println("myBST1::root.L: " + myBST1.getRoot().left);
        System.out.println("myBST1::root.L.L: " + myBST1.getRoot().left.left);
        System.out.println("myBST1::root.L.R: " + myBST1.getRoot().left.right);
        System.out.println("myBST1::root.R: " + myBST1.getRoot().right);
        System.out.println("myBST1::root.R.L: " + myBST1.getRoot().right.left);
        System.out.println("myBST1::root.R.R: " + myBST1.getRoot().right.right);


       
    }    
     
}
