import javax.swing.JOptionPane;
//type name = new type (parameters);
public class Greeter {
public static void main(String[] args) {
	String name;
	name = JOptionPane.showInputDialog(null, "What is your name?");
	JOptionPane.showMessageDialog(null, "Hi " + name);
}
}
