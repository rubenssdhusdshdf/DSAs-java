import javax.swing.JOptionPane;

public class HelloSOUT implements HelloInterface {

    @Override
    public void sayHello() {
        JOptionPane.showMessageDialog(null, "Hello from SOUT);
        
    }

}
