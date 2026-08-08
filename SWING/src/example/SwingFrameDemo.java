package example;

/* Imports all Swing classes such as JFrame and JLabel */
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingFrameDemo {
	public static void main(String[] args) {
		/* Creates a window with the title "My First Swing App" */
		JFrame frame = new JFrame("My First Swing App");
		/* Sets the window size to 500 × 500 pixels. */
		frame.setSize(300, 200);
		/* Closes the application when the window's close button is
		 * clicked.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* Creates a label displaying the text "Welcome to Java
		 * Swing!"
		 */
		JLabel label = new JLabel("Welcome to Java Swing!");
		/* Adds the label to the frame. */
		frame.add(label);
		/* Makes the window visible. */
		frame.setVisible(true);
	}
}
