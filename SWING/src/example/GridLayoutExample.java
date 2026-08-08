package example;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample {
	public static void main(String[] args) {

		JFrame frame = new JFrame("GridLayout");

		/*
		 * Sets the layout manager to GridLayout.
		 * Creates a grid with 2 rows and 2 columns.
		 * The available space is divided equally into 4 cells.
		 * Each component occupies one cell.
		 */
		frame.setLayout(new GridLayout(2, 2));
		/*
		 * Adds four buttons to the grid.
		 * They are placed from left to right, then top to bottom.
		 */
		frame.add(new JButton("Button 1"));
		frame.add(new JButton("Button 2"));
		frame.add(new JButton("Button 3"));
		frame.add(new JButton("Button 4"));
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
