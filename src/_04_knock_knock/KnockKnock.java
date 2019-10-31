package _04_knock_knock;

import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
	String DONE=JOptionPane.showInputDialog("Knock knock");
	if (DONE.equalsIgnoreCase("Who is there")) {
		String WHAT=JOptionPane.showInputDialog("Europe");
		if (WHAT.equalsIgnoreCase("Europe who")) {
			JOptionPane.showMessageDialog(null, "How dare you! I'm not a poo");
		}
	}
}
}
