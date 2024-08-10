import javax.swing.JOptionPane;

public class HelloJOP implements HelloInterface {

    @Override
    public void sayHello() {
        JOptionPane.showMessageDialog(null, "Hello from JOP");
    }

}
