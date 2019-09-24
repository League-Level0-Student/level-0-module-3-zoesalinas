//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot("batman");
		rob.setSpeed(1000);
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 10; i++) {
	String input =	JOptionPane.showInputDialog("What color do you want the batman to draw, if you don't care just press enter!");
		//5. Use an if/else statement to set the pen color that the user requested
if(input.equalsIgnoreCase("red")) {
	rob.setPenColor(Color.red);
}
        //6. If the user doesn’t enter anything, choose a random color
else {
	rob.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		for (int j = 0; j < 4; j++) {
			rob.move(90);
			rob.turn(90);
		}

		}
	}
}
