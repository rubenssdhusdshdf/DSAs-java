package ds5;
public class QNodeApp {
    public static void main(String[] args) {
        QNode<String> enda = new QNode<>("Enda");
        System.out.println("QNode enda: " + enda.toString());
        
        QNode<String> hermione = new QNode<>("Hermione");
        System.out.println("QNode hermione: " + hermione.toString());
        
        QNode<String> fred = new QNode<>("Fred", hermione);
        System.out.println("QNode fred: " + fred.toString());
    }
}

