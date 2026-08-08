package example;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample {
	public static void main(String[] args) {

		JFrame frame = new JFrame("BorderLayout");

		/* Sets the layout manager to BorderLayout. */
		frame.setLayout(new BorderLayout());
		/* Adds a button labeled North at the top of the window. */
		frame.add(new JButton("North"), BorderLayout.NORTH);
		/*
		 * Adds a button labeled Center in the center of the window.
		 * It expands to fill the remaining space.
		 */
		frame.add(new JButton("Center"), BorderLayout.CENTER);
		/* Adds a button labeled South at the top of the window. */
		frame.add(new JButton("South"), BorderLayout.SOUTH);
		/* Adds a button labeled East at the top of the window. */
		frame.add(new JButton("East"), BorderLayout.EAST);
		/* Adds a button labeled West at the top of the window. */
		frame.add(new JButton("West"), BorderLayout.WEST);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
