import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name;
	name = JOptionPane.showInputDialog("What is your name?");
	
	JOptionPane.showMessageDialog(null, "I know that you took the L in Fortnite last summer " + name);
}
}
