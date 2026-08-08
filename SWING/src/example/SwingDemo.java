package example;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My First Swing App");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * Sets the layout manager to FlowLayout, which arranges
		 * components from left to right and wraps them to the next
		 * line if needed
		 */
		frame.setLayout(new FlowLayout());

		/* Displays the text "Welcome to Java Swing!". */
		JLabel label = new JLabel("Welcome to Java Swing!");
		frame.add(label);
		/*
		 * Creates a text field that is approximately 20 columns
		 * wide
		 */
		JTextField textField = new JTextField(20);
		/* Creates a button labeled Submit. */
		JButton button = new JButton("Submit");
		/* Creates a checkbox with the label Accept Terms. */
		JCheckBox check = new JCheckBox("Accept Terms");
		/*
		 * Adds the components to the frame in the order they
		 * should appear
		 */
		frame.add(textField);
		frame.add(button);
		frame.add(check);
		/* Make the window visible. */
		frame.setVisible(true);
	}
}
