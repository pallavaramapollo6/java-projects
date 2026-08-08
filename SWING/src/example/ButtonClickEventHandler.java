package example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyButtonListener implements ActionListener {
	JLabel label;

	MyButtonListener(JLabel label) {
		this.label = label;
	}

	public void actionPerformed(ActionEvent e) {
		this.label.setText("Button Clicked!");
	}
}

public class ButtonClickEventHandler {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Event Handling");

		JButton button = new JButton("Click Me");
		JLabel label = new JLabel();

		/*
		 * addActionListener() needs an object that implements
		 * ActionListener.
		 */
		button.addActionListener(new MyButtonListener(label));

		frame.setLayout(new java.awt.FlowLayout());
		frame.add(button);
		frame.add(label);

		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
