package example;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample {
	public static void main(String[] args) {

		JFrame frame = new JFrame("FlowLayout");

		frame.setLayout(new FlowLayout());

		frame.add(new JButton("Button 1"));
		frame.add(new JButton("Button 2"));
		frame.add(new JButton("Button 3"));

		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
