package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Class {
public static void main(String[] args) {
	Robot ROB = new Robot();
	ROB.setSpeed(2000);
	ROB.penDown();
	ROB.turn(90);
	for (int i = 0; i < 180; i++) {
		ROB.move(1);
		ROB.turn(1);
	}
	ROB.turn(90);
	ROB.move(112);
	ROB.penUp();
	ROB.move(1000);
}
}
