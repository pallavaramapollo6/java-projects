package example;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutExample {
	public static void main(String[] args) {

		JFrame frame = new JFrame("BoxLayout");

		/*
		 * frame.getContentPane() gets the content area of the JFrame.
		 * new BoxLayout(..., BoxLayout.Y_AXIS) arranges components
		 * from top to bottom.
		 */
		frame.getContentPane().setLayout(
				new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.add(new JButton("Button 1"));
		frame.add(new JButton("Button 2"));
		frame.add(new JButton("Button 3"));
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* Center the window on the screen */
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
