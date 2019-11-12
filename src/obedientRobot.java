import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
			static Robot rob = new Robot("batman");
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Create a perfect shape.");
	String input = JOptionPane.showInputDialog("Would you like batman to draw a circle or a square.");
		if(input.equalsIgnoreCase("square")) {
			drawSquare();
		}
		if(input.equalsIgnoreCase("circle")) {
			drawCircle();
		}
		}
	
public static void drawSquare() {
		rob.penDown();
		rob.setSpeed(300);
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(360/4);
		}
}
		public static void drawCircle() {
			for (int i = 0; i < 360; i++) {
				rob.penDown();
				rob.setSpeed(300);
				rob.move(1);
				rob.turn(360/360);
			}
		}
	}

