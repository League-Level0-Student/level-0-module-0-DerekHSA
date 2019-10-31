package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
	String DONE=JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hi, "+DONE+"\nDon't tell you're name to strangers!");
	}
}