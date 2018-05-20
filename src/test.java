import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class test {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.setSpeed(100);
		rob.setPenWidth(10);
		rob.turn(180);
		rob.move(250);
		rob.turn(180);
		String Col = JOptionPane.showInputDialog("What color do you want?");
		if (Col.equalsIgnoreCase("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if (Col.equalsIgnoreCase("green")) {
			rob.setPenColor(0, 255, 0);
		}
		else if (Col.equalsIgnoreCase("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, we don't have that color.");
		}
		String Num = JOptionPane.showInputDialog("How many shapes do you want?");
		int num = Integer.parseInt(Num);
		for (int k=0;k<num;k++) {
			rob.move(100);
			for (int i=0;i<4;i++) {
				rob.penDown();
				rob.move(50);
				rob.turn(90);
				rob.penUp();
			}
		}
	}
}
