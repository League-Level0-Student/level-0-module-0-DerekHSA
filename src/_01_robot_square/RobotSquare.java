package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
    	String Bird=JOptionPane.showInputDialog("Yes?");
    	if (Bird=="Yes") {
			
		
			
		
Robot ROB = new Robot();

        // 3. Put the robot's pen down
ROB.penDown();

        // 6. Make the robot move as fast as possible
ROB.setSpeed(2000);

        // 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {



        //         2. Move your robot 200 pixels
ROB.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
ROB.turn(90);

}}
		}
    }

