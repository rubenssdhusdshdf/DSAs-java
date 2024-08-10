package ds5;

public class QNodeApp {
    public static void main (String[] args) {
        QNode <String>ruben = new QNode<>("ruben");
        System.out.println("QNode ruben: " + ruben.toString());    
        
        QNode <String>hermione = new QNode<>("hermione");
        System.out.println("QNode hermione: " + hermione.toString()); 
        
        QNode <String>fred = new QNode<>("fred");
        System.out.println("QNode fred: " + fred.toString());    
    }  
}
