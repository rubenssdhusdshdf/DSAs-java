package main.java.tree;

/**
 *
 * @author Ruben
 */

public class BTNodeApp {
    public static void main(String[] args) {
        BTNode<String> enda = new BTNode<>("Enda");
        System.out.println("BTNode enda: " + enda.toString());

        BTNode<String> emily = new BTNode<>("Emily");
        BTNode<String> erica = new BTNode<>("Erica");

        enda.left = emily;
        enda.right = erica;

        System.out.println("BTNode enda: " + enda.toString());
        System.out.println("BTNode emily: " + emily.toString());
        System.out.println("BTNode erica: " + erica.toString());

        System.out.println("Employee example...........");

        Employee mom = new Employee("Mom", 64);
        Employee clare = new Employee("Clare", 33);
        Employee trish = new Employee("Trish", 31);

        BTNode<Employee> btMom = new BTNode<>(mom);
        BTNode<Employee> btClare = new BTNode<>(clare);
        BTNode<Employee> btTrish = new BTNode<>(trish);

        btMom.left = btClare;
        btMom.right = btTrish;
        System.out.println("BTNode btMom: " + btMom.toString());

        double sum = 0.0, avg = 0.0;

        sum = btMom.elem.getAge() + btMom.left.elem.getAge() + btMom.right.elem.getAge();
        avg = sum / 3;

        System.out.println("Average of BTNodes / Employee ages: " + avg);
    }
}
