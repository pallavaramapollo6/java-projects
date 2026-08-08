package example;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutExample {
	public static void main(String[] args) {

		JFrame frame = new JFrame("GridBagLayout Example");
		frame.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		// Space around components
		gbc.insets = new Insets(5, 5, 5, 5);
		// First button
		gbc.gridx = 0;
		gbc.gridy = 0;
		frame.add(new JButton("Button 1"), gbc);

		// Second button
		gbc.gridx = 1;
		gbc.gridy = 0;
		frame.add(new JButton("Button 2"), gbc);

		// Third button
		gbc.gridx = 0;
		gbc.gridy = 1;
		frame.add(new JButton("Button 3"), gbc);

		// Fourth button
		gbc.gridx = 1;
		gbc.gridy = 1;
		frame.add(new JButton("Button 4"), gbc);

		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
