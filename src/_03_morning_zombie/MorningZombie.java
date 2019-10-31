package _03_morning_zombie;

import javax.swing.JOptionPane;

public class MorningZombie {
public static void main(String[] args) {
	String DONE=JOptionPane.showInputDialog("Brush your teeth\nGet dressed\nGet breakfeast\nPack for school");
if (DONE.equalsIgnoreCase("Done")) {
	JOptionPane.showMessageDialog(null, "CONGRADULATIONS");
}
}
}
